package interfaces;

import entities.Delivery;
import entities.Drone;


public interface GettingAvailableDroneForADelivery {
    Drone getAFreeDrone(Delivery delivery);
}
