package com.example.restpractice.dao;

import com.example.restpractice.dbTables.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackDao extends JpaRepository<Feedback,String> {
}
