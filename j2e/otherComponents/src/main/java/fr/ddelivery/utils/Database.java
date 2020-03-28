package fr.ddelivery.utils;

import fr.ddelivery.entities.Carrier;
import fr.ddelivery.entities.Delivery;
import fr.ddelivery.entities.Parcel;
import fr.ddelivery.entities.ParcelState;

import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * This class must represent the database which will contain all our data
 */
@Singleton
@Startup
public class Database {
    private int nbDelivery;

    int nextDelivery=0;
    private Map< String, Parcel> availablePackages= new HashMap<>();
    private Map<Integer, Delivery> deliveriesList = new HashMap<>();

    public Delivery nextDelivery(){
        if(nbDelivery< deliveriesList.size()-1) {
            nbDelivery++;
            return (Delivery) deliveriesList.values().toArray()[nextDelivery];
        }
        else return null;
    }
    public int getNbDelivery() {
        return nbDelivery;
    }

    public int getNbParcel(){
        return availablePackages.size();
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
        nbDelivery=0;
    }



    public void initDatabase(){
        deliveriesList=new HashMap<>();
        availablePackages= new HashMap<>();
        Parcel p= new Parcel("1");
        Delivery d=new Delivery("home", LocalDateTime.now(), availablePackages.get("1"));
        availablePackages.put("1", p);


    }
}


