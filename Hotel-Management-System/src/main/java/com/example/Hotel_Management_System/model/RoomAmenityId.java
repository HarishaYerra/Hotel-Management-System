package com.example.Hotel_Management_System.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import java.io.Serializable;

@Data
@Embeddable
public class RoomAmenityId implements Serializable {

    private Integer room_id;
    private Integer amenity_id;
}
