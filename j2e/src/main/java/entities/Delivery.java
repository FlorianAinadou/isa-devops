package entities;

import java.time.LocalDateTime;
import java.util.Optional;

public class Delivery 
{
    private String id;
    private String address;
    private LocalDateTime date;

    private Package aPackage;
    private Optional<Drone> drone;
}
