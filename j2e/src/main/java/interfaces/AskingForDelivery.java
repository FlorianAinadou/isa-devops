package interfaces;

import entities.Parcel;
import entities.Delivery;

public interface AskingForDelivery {
    Delivery createDelivery(Parcel aParcel);
}
