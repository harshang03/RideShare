package com.example.restpractice.dbTables;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Feedback {
	 @Id
	 String rideId;
	 int starsCount;
	 String description;
	 String rider;
	 String Driver;

	 public void setRideId(String rideId) {
		  this.rideId = rideId;
	 }

	 public String getRideId() {
		  return rideId;
	 }

	 public String getRider() {
		  return rider;
	 }

	 public void setRider(String rider) {
		  this.rider = rider;
	 }

	 public String getDriver() {
		  return Driver;
	 }

	 public void setDriver(String driver) {
		  Driver = driver;
	 }

	 public int getStarsCount() {
		  return starsCount;
	 }

	 public void setStarsCount(int starsCount) {
		  this.starsCount = starsCount;
	 }

	 public String getDescription() {
		  return description;
	 }

	 public void setDescription(String description) {
		  this.description = description;
	 }

}