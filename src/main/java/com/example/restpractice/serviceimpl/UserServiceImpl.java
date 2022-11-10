package com.example.restpractice.serviceimpl;

import com.example.restpractice.dbTables.User;
import com.example.restpractice.dao.UserDao;
import com.example.restpractice.passEnc.EncryptPassword;
import com.example.restpractice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
	 @Autowired
	 private UserDao userDao;

	 @Override
	 public List<User> getAllUser() {
		  return userDao.findAll();
	 }

	 public User getUser(String userID) {
		  return userDao.findById(userID).get();
	 }

	 @Override
	 public boolean addUser(User user) {
		  try {
				user.setPassword(EncryptPassword.encrypt(user.getPassword()));
				System.out.println(user.getPassword());
				userDao.save(user);
				return true;
		  } catch (Exception e) {
				e.printStackTrace();
				return false;
		  }
	 }

}
