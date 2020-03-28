package fr.ddelivery.interfaces;

import java.util.List;

public interface BillingSystem {

    void getDeliveries();
    void computeBills();
    List<String> getBills();
}
