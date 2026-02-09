package com.example.Hotel_Management_System.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import java.io.Serializable;

@Data
@Embeddable
public class HotelAmenityId implements Serializable {

    private Integer hotel_id;
    private Integer amenity_id;
}
