package com.example.restpractice.dao;

import com.example.restpractice.dbTables.AvailableForRide;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvailableForRideDao extends JpaRepository<AvailableForRide,String> {
}
