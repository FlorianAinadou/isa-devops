package fr.ddelivery.components.deliverySystem;


import fr.ddelivery.entities.Delivery;
import fr.ddelivery.entities.Parcel;
import fr.ddelivery.interfaces.DeliverySystem;
import fr.ddelivery.utils.Database;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
    public Delivery nextDelivery() {
        return database.nextDelivery();
    }

    @Override
    public void initDatabase() {
        database.initDatabase();
    }

    @Override
    public Delivery createDelivery() {
        LocalDateTime localDateTime = LocalDateTime.of(2020,12,12,12,12);
        Delivery delivery = new Delivery("address", localDateTime, new Parcel("1"));
        addDelivery(delivery);
        return delivery;

    }

    @Override
    public List<Delivery> getDailyDeliveries() {
        List<Delivery> deliveries = new ArrayList<>(database.getDeliveriesList().values());
        return deliveries;
    }
}
