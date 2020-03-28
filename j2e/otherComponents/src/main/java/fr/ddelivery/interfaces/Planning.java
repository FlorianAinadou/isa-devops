package fr.ddelivery.interfaces;



import fr.ddelivery.entities.Delivery;

import javax.ejb.Local;


@Local
public interface Planning {

    Delivery receiveDelivery();

}
