package com.example.restpractice.controller;

import com.example.restpractice.dbTables.AvailableForRide;
import com.example.restpractice.dbTables.Feedback;
import com.example.restpractice.dbTables.User;
import com.example.restpractice.passEnc.EncryptPassword;
import com.example.restpractice.services.FeedbackService;
import com.example.restpractice.services.RideService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.restpractice.services.UserService;

import java.util.List;

@RestController
public class MyController {

	 @Autowired
	 private UserService userService;
	 @Autowired
	 private FeedbackService feedbackService;

	 @Autowired
	 private RideService rideService;

	 @PostMapping("/login")
	 public ResponseEntity<HttpStatus> login(@RequestParam(name = "uid") String uid, @RequestParam(name = "password") String password) {
		  User user = new User();
		  user.setUserID(uid);
		  if (this.userService.getUser(user.getUserID()).getPassword().equals(EncryptPassword.encrypt(password))) {
				return new ResponseEntity<>(HttpStatus.OK);
		  } else {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		  }

	 }


	 @GetMapping("/user")
	 public List<User> user() {
		  System.out.println("user calling...");
		  return this.userService.getAllUser();
	 }

	 @GetMapping("/user/{userID}")
	 public User getUser(@PathVariable String userID) {
		  return this.userService.getUser(userID);
	 }

	 @PostMapping("/addUser")
	 public ResponseEntity<HttpStatus> addUser(@RequestBody User user) {
		  if (this.userService.addUser(user)) {
				return new ResponseEntity<>(HttpStatus.OK);
		  } else {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		  }
	 }

	 @GetMapping("/getAllFeedback")
	 public List<Feedback> getAllFeedbacks() {
		  return this.feedbackService.getAllFeedback();
	 }

	 @GetMapping("/getFeedback")
	 public Feedback getFeedbacks(@RequestParam(name = "rideId") String rideId) {
		  return this.feedbackService.getFeedBack(rideId);
	 }

	 @PostMapping("/giveFeedback")
	 public ResponseEntity<HttpStatus> giveFeedback(@RequestBody Feedback feedback) {
		  if (this.feedbackService.addFeedback(feedback)) {
				return new ResponseEntity<>(HttpStatus.OK);
		  } else {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		  }
	 }

	 @GetMapping("/getAllAvailableRide")
	 public List<AvailableForRide> getAllAvailableRide() {
		  return this.rideService.getAllAvailableRide();
	 }

	 @PostMapping("/addRide")
	 public ResponseEntity<HttpStatus> addRide(@RequestBody AvailableForRide availableForRide) {
		  System.out.println(availableForRide.getCarCompany());
		  if (rideService.addRide(availableForRide)) {
				return new ResponseEntity<>(HttpStatus.OK);
		  } else {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		  }
	 }

	 @PostMapping("/conformRide")
	 public ResponseEntity<HttpStatus> conformRide(@RequestParam(name = "rideId") String rideId, @RequestParam(name = "driverId") String driverId, @RequestParam(name = "pillionId") String pillionId) {
		  if (rideService.conformRide(rideId, driverId, pillionId)) {
				return new ResponseEntity<>(HttpStatus.OK);
		  } else
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	 }

}
