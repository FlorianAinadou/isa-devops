package fr.ddelivery.entities;

public class Parcel
{
    private final String reference;
    private final ParcelState parcelState;
    private final Carrier carrier;

    public Parcel(String reference, ParcelState parcelState, Carrier carrier){
        this.reference = reference;
        this.parcelState = parcelState;
        this.carrier = carrier;

    }

    public Carrier getCarrier() {
        return carrier;
    }

    public ParcelState getParcelState() {
        return parcelState;
    }

    public String getReference() {
        return reference;
    }
}
