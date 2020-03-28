package fr.ddelivery.components;



import fr.ddelivery.interfaces.DeliverySystem;
import fr.ddelivery.utils.Database;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class DeliverySystemTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml")
                .addPackage(Database.class.getPackage())
                .addPackage(DeliverySystemBean.class.getPackage())
                .addPackage(PlanningBean.class.getPackage())
                .addPackage(BillingServiceBean.class.getPackage());
    }

    @EJB(name = "deliverySystem-stateless")
    DeliverySystem deliverySystem;

    @EJB
    Database database;

    @Test
    public void initDatabase(){
        assertEquals(0, database.getNbDelivery() );
        assertEquals(0, database.getNbParcel() );
        database.initDatabase();
        assertEquals(1, database.getNbParcel() );

    }

    @Test
    public void getParcel(){
        database.initDatabase();
        assertNotNull( database.getParcel("1") );
    }

    @Test
    public void flush(){
        database.initDatabase();
        assertEquals(1, database.getNbParcel() );
        database.flush();
        assertEquals(0, database.getNbParcel() );

    }
}
