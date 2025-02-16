package com.airticket.airticket_reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airticket.airticket_reservation.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
