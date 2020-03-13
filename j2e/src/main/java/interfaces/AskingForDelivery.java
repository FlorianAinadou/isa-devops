package interfaces;

import entities.Colis;
import entities.Delivery;

public interface AskingForDelivery {

    Delivery createDelivery(Colis colis);
}
