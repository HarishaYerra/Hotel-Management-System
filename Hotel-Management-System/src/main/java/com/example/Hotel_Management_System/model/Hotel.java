package com.example.Hotel_Management_System.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "hotel")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hotel_id;

    private String name;

    private String location;

    @Lob
    private String description;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    private List<HotelAmenity> hotelAmenities;
}
