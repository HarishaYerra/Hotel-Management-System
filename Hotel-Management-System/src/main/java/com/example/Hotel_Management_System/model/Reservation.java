package com.example.Hotel_Management_System.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reservation_id;

    private String guest_name;
    private String guest_email;
    private String guest_phone;

    private LocalDate check_in_date;
    private LocalDate check_out_date;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @OneToMany(mappedBy = "reservation")
    private List<Payment> payments;

    @OneToOne(mappedBy = "reservation")
    private Review review;
}
