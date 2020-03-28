package fr.ddelivery.entities;

public class Parcel
{
    private final String reference;
    private final ParcelState parcelState;
    private final Carrier carrier;

    public Parcel(String reference){
        this.reference = reference;
        this.parcelState = ParcelState.stored;
        this.carrier = new Carrier(1);

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


    @Override
    public String toString() {
        return "Parcel{" +
                "reference='" + reference + '\'' +
                ", parcelState=" + parcelState +
                ", carrier=" + carrier +
                '}';
    }
}
