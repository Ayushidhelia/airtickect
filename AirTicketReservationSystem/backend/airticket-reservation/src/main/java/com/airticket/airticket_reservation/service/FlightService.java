package com.airticket.airticket_reservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airticket.airticket_reservation.model.Flight;
import com.airticket.airticket_reservation.repository.FlightRepository;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public Flight addFlight(Flight flight) {
        return flightRepository.save(flight);
    }
}
