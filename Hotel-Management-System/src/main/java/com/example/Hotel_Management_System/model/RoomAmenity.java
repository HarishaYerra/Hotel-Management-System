package com.example.Hotel_Management_System.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "roomamenity")
public class RoomAmenity {

    @EmbeddedId
    private RoomAmenityId id;

    @ManyToOne
    @MapsId("room_id")
    @JoinColumn(name = "room_id")
    private Room room;

    @ManyToOne
    @MapsId("amenity_id")
    @JoinColumn(name = "amenity_id")
    private Amenity amenity;
}
