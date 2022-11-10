package com.example.restpractice.dbTables;

import javax.persistence.*;

@Entity
public class AvailableForRide {

	 @Id
	 String rideId;
	 @Column(nullable = false)
	 String driver;
	 @Column(nullable = false)
	 String carCompany;
	 @Column(nullable = false)
	 String carModel;
	 @Column(nullable = false)
	 String carRegNumber;
	 @Column(nullable = false)
	 String availableSeats;
	 @Column(nullable = false)
	 String destination;
	 @Column(nullable = false)
	 String source;
	 @Column(nullable = false)
	 String mobileNumber;

	 public String getRideId() {
		  return rideId;
	 }

	 public void setRideId(String rideId) {
		  this.rideId = rideId;
	 }

	 public String getDriver() {
		  return driver;
	 }

	 public void setDriver(String driver) {
		  this.driver = driver;
	 }

	 public String getCarCompany() {
		  return carCompany;
	 }

	 public void setCarCompany(String carCompany) {
		  this.carCompany = carCompany;
	 }

	 public String getCarModel() {
		  return carModel;
	 }

	 public void setCarModel(String carModel) {
		  this.carModel = carModel;
	 }

	 public String getCarRegNumber() {
		  return carRegNumber;
	 }

	 public void setCarRegNumber(String carRegNumber) {
		  this.carRegNumber = carRegNumber;
	 }

	 public String getAvailableSeats() {
		  return availableSeats;
	 }

	 public void setAvailableSeats(String availableSeats) {
		  this.availableSeats = availableSeats;
	 }

	 public String getDestination() {
		  return destination;
	 }

	 public void setDestination(String destination) {
		  this.destination = destination;
	 }

	 public String getSource() {
		  return source;
	 }

	 public void setSource(String source) {
		  this.source = source;
	 }

	 public String getMobileNumber() {
		  return mobileNumber;
	 }

	 public void setMobileNumber(String mobileNumber) {
		  this.mobileNumber = mobileNumber;
	 }

}
