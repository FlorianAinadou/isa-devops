package fr.ddelivery.entities;

public class Colis
{
    private String reference;
    
    private ColisState colisState;
    private Carrier carrier;

    public Colis(String reference) {
        this.reference = reference;
        this.colisState = ColisState.stored;
    }
}
