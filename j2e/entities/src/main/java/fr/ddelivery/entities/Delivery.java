package fr.ddelivery.entities;

import java.time.LocalDateTime;
import java.util.Optional;

public class Delivery 
{
    private int id;
    private String address;
    private LocalDateTime date;

    private Parcel parcel;
    private Optional<Drone> drone;

    public Delivery(String address, LocalDateTime date, Parcel parcel) {
        this.id = 1;
        this.address = address;
        this.date = date;
        this.parcel = parcel;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Parcel getParcel() {
        return parcel;
    }
}
