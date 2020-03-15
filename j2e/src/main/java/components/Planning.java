package components;

import entities.Delivery;

import javax.ejb.EJB;



public interface Planning {
    boolean addDelivery(Delivery delivery);
    Package getPackage( String packageReference);

}
