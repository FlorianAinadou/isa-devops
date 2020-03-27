package fr.ddelivery.components;

import fr.ddelivery.interfaces.BillingSystem;
import fr.ddelivery.interfaces.Planning;
import fr.ddelivery.utils.Database;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;

import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class BillingServiceBeanTest {
    @Deployment
    public static WebArchive creatDeployment() {
        return ShrinkWrap.create(WebArchive.class)
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                .addPackage(Database.class.getPackage())
                .addPackage(DeliverySystemBean.class.getPackage())
                .addPackage(PlanningBean.class.getPackage())
                .addPackage(BillingServiceBean.class.getPackage());
    }

    @EJB
    BillingSystem billingSystem;

    @EJB
    Planning planning;

    @Before
    public void init() {
        planning.receiveDelivery();
        billingSystem.getDeliveries();
        billingSystem.computeBills();
    }

    @Test
    public void getBills() {
        List<String> bills = new ArrayList<>(billingSystem.getBills());

        assertEquals(1, bills.size());
        assertEquals("Bill for the delivery number : 1 at 2020-12-12T12:12 for address", bills.get(0));
    }
}
