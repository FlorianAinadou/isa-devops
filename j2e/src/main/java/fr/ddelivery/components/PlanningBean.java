package fr.ddelivery.components;
import fr.ddelivery.DeliverySystem;
import fr.ddelivery.Planning;
import fr.ddelivery.entities.Delivery;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class PlanningBean implements Planning {

    @EJB
    protected DeliverySystem delivery;

    @Override
    public String receiveHello() {
        return delivery.createDelivery();
    }
}
