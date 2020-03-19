package fr.ddelivery.components.plannings;


import fr.ddelivery.entities.Colis;
import fr.ddelivery.entities.Delivery;
import fr.ddelivery.entities.Parcel;
import fr.ddelivery.interfaces.DeliverySystem;
import fr.ddelivery.interfaces.Planning;
import fr.ddelivery.utils.Database;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.time.LocalDateTime;

@Stateless(name = "planning-stateless")
public class DeliverySystemBean extends AbstractDeliverySystemBean implements DeliverySystem {

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

    @Override
    public Delivery createDelivery() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return new Delivery("address", localDateTime, new Colis("The heart must go on"));

    }
}
