package entities;

import java.util.Optional;

public class Drone 
{
    private String reference;
    private int flightTime;

    private Optional<Parcel> colis;
    private DroneLocation droneLocation;
}
