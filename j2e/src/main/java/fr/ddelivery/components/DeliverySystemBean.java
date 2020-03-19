package fr.ddelivery.components;

import fr.ddelivery.Delivery;
import fr.ddelivery.PlanningDelivery;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class DeliverySystemBean implements Delivery {

    @EJB
    protected PlanningDelivery planner;

    @Override
    public String receiveHello() {
        return planner.sendHello();

    }
}
