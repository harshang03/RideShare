package com.example.restpractice.services;

import com.example.restpractice.dbTables.Feedback;

import java.util.List;

public interface FeedbackService {
	 public List<Feedback> getAllFeedback();
	 public Feedback getFeedBack(String rideId);
	 public boolean addFeedback(Feedback feedback);
}
