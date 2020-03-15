package utils;
import entities.Delivery;

import javax.ejb.Singleton;
import java.util.HashMap;
import java.util.Map;


/**
 * This class must represent the database which will contain all our data
 */
@Singleton
public class Database {
    private int nbDelivery;

    private Map< String, Package> availablePackages= new HashMap<>();
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

    public Package getPackage(String packageReference){
        return availablePackages.get(packageReference);
    }

    public void flush(){
        availablePackages = new HashMap<>();
        deliveriesList=new HashMap<>();
        nbDelivery=0;
    }
}


