package fr.ddelivery.webservice;

import fr.ddelivery.entities.Delivery;
import fr.ddelivery.entities.Parcel;
import fr.ddelivery.interfaces.DeliverySystem;


import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

@WebService(targetNamespace = "http://localhost:8080")
@Stateless(name = "PlanningWs")
public class DeliverySystemWebServiceImpl implements DeliverySystemWebService {

    @EJB(name = "stateless-planning")
    DeliverySystem deliverySystem;

    @Override
    public Parcel getParcel(String packageReference) {
       return deliverySystem.getParcel(packageReference);
    }

    @Override
    public void initDatabase() {
        deliverySystem.initDatabase();
    }

    @Override
    public Delivery getNextDelivery() {
        return deliverySystem.nextDelivery();
    }

}
