package components;

import entities.Delivery;
import entities.Parcel;

import javax.ejb.EJB;
import javax.ejb.Local;


@Local
public interface Planning {
    boolean addDelivery(Delivery delivery);
    Parcel getParcel(String packageReference);
    void initDatabase();

}
