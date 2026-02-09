package com.example.Hotel_Management_System.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer review_id;

    private Integer rating;

    @Lob
    private String comment;

    private LocalDate review_date;

    @OneToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;
}
