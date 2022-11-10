package com.example.restpractice.dbTables;

import javax.persistence.*;

@Entity
public class ConformRide {

	 @Id
	 String rideId;
	 @Column(nullable = false)
	 String driver;
	 @Column(nullable = false)
	 String pillion;

	 public String getRideId() {
		  return rideId;
	 }

	 public void setRideId(String rideId) {
		  this.rideId = rideId;
	 }

	 public String getPillion() {
		  return pillion;
	 }

	 public void setPillion(String pillion) {
		  this.pillion = pillion;
	 }

	 public String getDriver() {
		  return driver;
	 }

	 public void setDriver(String driver) {
		  this.driver = driver;
	 }

}