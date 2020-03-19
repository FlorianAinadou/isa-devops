package fr.ddelivery;



import javax.ejb.Local;


@Local
public interface DeliverySystem {

    String createDelivery();

}
