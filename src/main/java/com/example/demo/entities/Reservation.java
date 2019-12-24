package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name="Reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



}
