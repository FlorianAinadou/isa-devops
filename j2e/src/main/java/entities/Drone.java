package entities;

import java.util.Optional;

public class Drone 
{
    private String reference;
    private int flightTime;

    private Optional<Package> colis;
    private DroneLocation droneLocation;
}
