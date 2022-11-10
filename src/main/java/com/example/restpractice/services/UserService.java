package com.example.restpractice.services;

import com.example.restpractice.dbTables.User;

import java.util.List;

public interface UserService {
	 public List<User> getAllUser();
	 public User getUser(String userID);
	 public boolean addUser(User user);
}
