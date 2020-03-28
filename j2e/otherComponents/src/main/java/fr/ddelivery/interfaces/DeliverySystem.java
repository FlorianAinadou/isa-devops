package fr.ddelivery.interfaces;



import fr.ddelivery.entities.Delivery;
import fr.ddelivery.entities.Parcel;

import javax.ejb.Local;
import java.util.List;


@Local
public interface DeliverySystem {
    boolean addDelivery(Delivery delivery);
    Parcel getParcel(String packageReference);
    Delivery nextDelivery();
    void initDatabase();
    Delivery createDelivery();

    List<Delivery> getDailyDeliveries();

}
