package com.example.restpractice.dbTables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	 @Column(name = "firstname", nullable = false, columnDefinition = "VARCHAR(30)")
	 String firstName;
	 @Column(name = "lastname", nullable = false, columnDefinition = "VARCHAR(30)")
	 String lastName;

	 @Column(name = "email", nullable = false, columnDefinition = "VARCHAR(30)")
	 String email;
	 @Id
	 @Column(name = "userid", nullable = false, columnDefinition = "VARCHAR(30)")
	 String userID;
	 @Column(name = "password", nullable = false, columnDefinition = "VARCHAR(512)")
	 String password;

	 public String getPassword() {
		  return password;
	 }

	 public void setPassword(String password) {
		  this.password = password;
	 }

	 public String getUserID() {
		  return userID;
	 }

	 public void setUserID(String userID) {
		  this.userID = userID;
	 }

	 public String getFirstName() {
		  return firstName;
	 }

	 public void setFirstName(String firstName) {
		  this.firstName = firstName;
	 }

	 public String getLastName() {
		  return lastName;
	 }

	 public void setLastName(String lastName) {
		  this.lastName = lastName;
	 }

	 public String getEmail() {
		  return email;
	 }

	 public void setEmail(String email) {
		  this.email = email;
	 }

	 public User() {

	 }
}
