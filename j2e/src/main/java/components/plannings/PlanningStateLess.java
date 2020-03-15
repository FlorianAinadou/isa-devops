package components.plannings;

import entities.Delivery;
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
    public Package getPackage(String packageReference){
        return database.getPackage(packageReference);
    }
}
