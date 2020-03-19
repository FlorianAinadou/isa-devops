package components.plannings;

import components.DeliverySystem;
import entities.Delivery;

public abstract class AbstractDeliverySystemBean implements DeliverySystem {


    @Override
    public boolean addDelivery(Delivery delivery) {
        return false;
    }


}
