package fr.ddelivery.utils;

import fr.ddelivery.entities.Carrier;
import fr.ddelivery.entities.Delivery;
import fr.ddelivery.entities.Parcel;
import fr.ddelivery.entities.ParcelState;

import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.HashMap;
import java.util.Map;


/**
 * This class must represent the database which will contain all our data
 */
@Singleton
@Startup
public class Database {
    private int nbDelivery;

    private Map< String, Parcel> availablePackages= new HashMap<>();
    private Map<Integer, Delivery> deliveriesList = new HashMap<>();


    public int getNbDelivery() {
        return nbDelivery;
    }

    public Map<Integer, Delivery> getDeliveriesList() {
        return deliveriesList;
    }
    

    public void addDelivery(Delivery delivery){
        deliveriesList.put(nbDelivery, delivery);
        nbDelivery=nbDelivery+1;
    }

    public Parcel getParcel(String packageReference){
        return availablePackages.get(packageReference);
    }

    public void flush(){
        availablePackages = new HashMap<>();
        deliveriesList=new HashMap<>();
        nbDelivery=0;
    }

    public void initDatabase(){
        Parcel p= new Parcel("1");
        availablePackages.put("1", p);
    }
}


