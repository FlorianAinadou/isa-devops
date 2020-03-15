package components.plannings;

import components.Planning;
import entities.Delivery;

public abstract class AbstractPlanningBean implements Planning {


    @Override
    public boolean addDelivery(Delivery delivery) {
        return false;
    }

    @Override
    public Package getPackage(String packageReference) {
        return null;
    }
}
