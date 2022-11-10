package com.example.restpractice.dao;

import com.example.restpractice.dbTables.ConformRide;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConformRideDao extends JpaRepository<ConformRide, String> {
}
