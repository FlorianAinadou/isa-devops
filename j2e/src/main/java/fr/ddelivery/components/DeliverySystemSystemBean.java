package fr.ddelivery.components;

import fr.ddelivery.DeliverySystem;
import fr.ddelivery.Planning;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class DeliverySystemSystemBean implements DeliverySystem {


    @Override
    public String createDelivery() {
        return "Hello";

    }
}
