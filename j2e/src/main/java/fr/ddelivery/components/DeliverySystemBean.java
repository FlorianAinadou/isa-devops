package fr.ddelivery.components;

import fr.ddelivery.Delivery;
import fr.ddelivery.Planning;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class DeliverySystemBean implements Delivery {

    @EJB
    protected Planning planner;

    @Override
    public String receiveHello() {
        return planner.sendHello();

    }
}
