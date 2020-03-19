package components.plannings;

import entities.Delivery;
import entities.Parcel;
import utils.Database;

import javax.ejb.EJB;

public class PlanningStateLess extends AbstractPlanningBean {

    @EJB Database database;

    @Override
    public boolean addDelivery(Delivery delivery){
        database.addDelivery(delivery);
        return true;
    }

    @Override
    public Parcel getParcel(String packageReference){
        return database.getParcel(packageReference);
    }
}
