package interfaces;

import entities.Package;
import entities.Delivery;

public interface AskingForDelivery {
    Delivery createDelivery(Package aPackage);
}
