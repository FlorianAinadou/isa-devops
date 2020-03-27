package fr.ddelivery.components;

import fr.ddelivery.entities.Delivery;
import fr.ddelivery.interfaces.Planning;
import fr.ddelivery.utils.Database;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;

import static org.junit.Assert.assertEquals;

@RunWith(Arquillian.class)
public class PlanningBeanTest {
    @Deployment
    public static WebArchive createDeployment() {
        return ShrinkWrap.create(WebArchive.class)
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                .addPackage(Database.class.getPackage())
                .addPackage(DeliverySystemBean.class.getPackage())
                .addPackage(PlanningBean.class.getPackage());
    }
    @EJB
    private Planning planning;

    @Test
    public void receiveDelivery() {
        Delivery delivery = planning.receiveDelivery();
        assertEquals("address", delivery.getAddress());
        assertEquals(1, delivery.getId());
    }
}
