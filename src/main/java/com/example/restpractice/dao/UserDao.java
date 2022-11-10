package com.example.restpractice.dao;

import com.example.restpractice.dbTables.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,String> {
}
