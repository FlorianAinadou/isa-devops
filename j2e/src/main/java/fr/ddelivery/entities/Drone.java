package entities;

import java.util.Optional;

public class Drone 
{
    private String reference;
    private int flightTime;

    private Optional<Colis> colis;
    private DroneLocation droneLocation;
}
