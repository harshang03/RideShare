package com.example.restpractice.serviceimpl;

import com.example.restpractice.dao.FeedbackDao;
import com.example.restpractice.dbTables.Feedback;
import com.example.restpractice.services.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {
	 @Autowired
	 private FeedbackDao feedbackDao;

	 @Override
	 public List<Feedback> getAllFeedback() {
		  return feedbackDao.findAll();
	 }

	 @Override
	 public Feedback getFeedBack(String rideId) {
		  return feedbackDao.findById(rideId).get();
	 }

	 @Override
	 public boolean addFeedback(Feedback feedback) {
		  try {
				feedbackDao.save(feedback);
				System.out.println("feedback saved!!!");
				return true;
		  } catch (Exception e) {
				e.printStackTrace();
				return false;
		  }
	 }
}
