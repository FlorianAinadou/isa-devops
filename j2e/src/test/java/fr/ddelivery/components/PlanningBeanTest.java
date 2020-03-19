package fr.ddelivery.components;

import fr.ddelivery.DeliverySystem;
import fr.ddelivery.Planning;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class PlanningBeanTest {
    @Deployment
    public static WebArchive createDeployment() {
        return ShrinkWrap.create(WebArchive.class)
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                .addPackage(PlanningBean.class.getPackage())
                .addPackage(DeliverySystemSystemBean.class.getPackage());
    }
    @EJB
    private Planning planning;

    @Test
    public void receiveHello() {
        assertEquals("Hello", planning.receiveHello());
    }
}
