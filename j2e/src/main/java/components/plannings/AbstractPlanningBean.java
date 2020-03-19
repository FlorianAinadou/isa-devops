package components.plannings;

import components.Planning;
import entities.Delivery;
import entities.Parcel;

public abstract class AbstractPlanningBean implements Planning {


    @Override
    public boolean addDelivery(Delivery delivery) {
        return false;
    }

    @Override
    public Parcel getParcel(String packageReference) {
        return null;
    }
}
