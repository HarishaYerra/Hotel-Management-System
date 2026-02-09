package com.example.Hotel_Management_System.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name = "roomtype")
public class RoomType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer room_type_id;

    private String type_name;

    @Lob
    private String description;

    private Integer max_occupancy;

    @Column(precision = 10, scale = 2)
    private BigDecimal price_per_night;

    @OneToMany(mappedBy = "roomType")
    private List<Room> rooms;
}
