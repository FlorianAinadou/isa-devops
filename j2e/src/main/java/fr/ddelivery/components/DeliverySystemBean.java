package fr.ddelivery.components;

import fr.ddelivery.Delivery;
import fr.ddelivery.PlanningDelivery;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.EJB;

public class DeliverySystemBean implements Delivery {

    @EJB
    protected PlanningDelivery planner;

    @Override
    public void receiveHello() {
        String test = planner.sendHello();
        Logger log = Logger.getLogger(DeliverySystemBean.class.getName());
        log.log(Level.WARNING,test);
    }
}
