package fr.ddelivery.components;
import fr.ddelivery.PlanningDelivery;

import javax.ejb.Stateless;

@Stateless
public class PlanningBean implements PlanningDelivery {


    protected String mess ="Hello";

    @Override
    public String sendHello() {
        return mess;
    }
}
