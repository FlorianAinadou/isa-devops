package fr.ddelivery.components;
import fr.ddelivery.entities.Delivery;
import fr.ddelivery.interfaces.DeliverySystem;
import fr.ddelivery.interfaces.Planning;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class PlanningBean implements Planning {

    @EJB
    protected DeliverySystem delivery;

    @Override
    public Delivery receiveDelivery() {
        return delivery.createDelivery();
    }
}
