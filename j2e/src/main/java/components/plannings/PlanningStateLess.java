package components.plannings;

import entities.Delivery;
import entities.Parcel;
import utils.Database;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless(name = "planning-stateless")
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

    @Override
    public void initDatabase() {
        database.initDatabase();
    }
}
