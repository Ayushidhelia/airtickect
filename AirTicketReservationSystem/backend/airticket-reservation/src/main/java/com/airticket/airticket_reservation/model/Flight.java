package com.airticket.airticket_reservation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String flightName;
    private String departureCity;
    private String destinationCity;
    private String departureTime;
    private String arrivalTime;
    private Double price;

    // Getters and Setters
}
