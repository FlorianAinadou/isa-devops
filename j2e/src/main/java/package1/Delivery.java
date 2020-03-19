package package1;

import java.time.LocalDateTime;
import java.util.Optional;

import package1.Colis;
import package1.Drone;

public class Delivery 
{
    private String id;
    private String address;
    private LocalDateTime date;

    private Colis colis;
    private Optional<Drone> drone;
}
