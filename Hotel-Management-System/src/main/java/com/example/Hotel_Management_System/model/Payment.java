package com.example.Hotel_Management_System.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer payment_id;

    @Column(precision = 10, scale = 2)
    private BigDecimal amount;

    private LocalDate payment_date;

    private String payment_status;

    @ManyToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;
}
