package com.example.restpractice.services;

import com.example.restpractice.dbTables.AvailableForRide;

import java.time.LocalDateTime;
import java.util.List;

public interface RideService {
	 public List<AvailableForRide> getAllAvailableRide();
	 public boolean addRide(AvailableForRide availableForRide);

	 public boolean conformRide(String rideId, String driver, String pillion /*, LocalDateTime dateTime*/);
}
