package package1;

import package1.Colis;

import java.time.LocalDate;
import java.util.HashSet;

public class Invoice 
{
    private String reference;
    private double amount;
    private LocalDate date;
    private boolean isPaid;

    private HashSet<Colis> colis;
}
