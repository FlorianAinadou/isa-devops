package components;

import entities.Delivery;
import entities.Parcel;

import javax.ejb.EJB;



public interface Planning {
    boolean addDelivery(Delivery delivery);
    Parcel getParcel(String packageReference);

}
