package fr.ddelivery.components.plannings;


import fr.ddelivery.entities.Delivery;
import fr.ddelivery.interfaces.DeliverySystem;

public abstract class AbstractDeliverySystemBean implements DeliverySystem {


    @Override
    public boolean addDelivery(Delivery delivery) {
        return false;
    }


}
