package fr.ddelivery.interfaces;



import fr.ddelivery.entities.Delivery;
import fr.ddelivery.entities.Parcel;

import javax.ejb.Local;


@Local
public interface DeliverySystem {
    boolean addDelivery(Delivery delivery);
    Parcel getParcel(String packageReference);
    void initDatabase();
    Delivery createDelivery();

}
