package com.example.Hotel_Management_System.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "hotelamenity")
public class HotelAmenity {

    @EmbeddedId
    private HotelAmenityId id;

    @ManyToOne
    @MapsId("hotel_id")
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    @ManyToOne
    @MapsId("amenity_id")
    @JoinColumn(name = "amenity_id")
    private Amenity amenity;
}
