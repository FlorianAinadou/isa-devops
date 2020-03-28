package fr.ddelivery.components;

import fr.ddelivery.entities.Delivery;
import fr.ddelivery.interfaces.BillingSystem;
import fr.ddelivery.interfaces.DeliverySystem;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class BillingServiceBean implements BillingSystem {

    @EJB
    DeliverySystem delivery;

    List<Delivery> deliveryList;
    List<String> bills = new ArrayList<>();

    @Override
    public void getDeliveries() {
        deliveryList = new ArrayList<>(delivery.getDailyDeliveries());
    }

    @Override
    public void computeBills() {
        bills.clear();
        for(Delivery deliver: deliveryList){
            bills.add("Bill for the delivery number : " + deliver.getId() + " at " +deliver.getDate() + " for " + deliver.getAddress());
        }
    }

    @Override
    public List<String> getBills() {
        return bills;
    }
}
