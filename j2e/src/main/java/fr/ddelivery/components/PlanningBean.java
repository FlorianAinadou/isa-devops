package fr.ddelivery.components;
import fr.ddelivery.Planning;

import javax.ejb.Stateless;

@Stateless
public class PlanningBean implements Planning {


    protected String mess ="Hello";

    @Override
    public String sendHello() {
        return mess;
    }
}
