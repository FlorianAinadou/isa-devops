package entities;

import java.time.LocalDateTime;
import java.util.Optional;

public class Delivery 
{
    private String id;
    private String address;
    private LocalDateTime date;

    private Colis colis;
    private Optional<Drone> drone;
}
