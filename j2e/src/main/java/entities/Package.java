package entities;

public class Package
{
    private final String reference;
    private final PackageState packageState;
    private final Carrier carrier;

    public Package(String reference, PackageState packageState, Carrier carrier){
        this.reference = reference;
        this.packageState = packageState;
        this.carrier = carrier;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public PackageState getPackageState() {
        return packageState;
    }

    public String getReference() {
        return reference;
    }
}
