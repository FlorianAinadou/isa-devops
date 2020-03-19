package entities;

import java.time.LocalDateTime;
import java.util.Optional;

public class Delivery 
{
    private String id;
    private String address;
    private LocalDateTime date;

    private Parcel aParcel;
    private Optional<Drone> drone;
}
