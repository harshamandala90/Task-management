package com.taskmanagement.tool.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taskmanagement.tool.model.Comment;

@Repository
public interface Jpacommentrepository extends JpaRepository<Comment, Integer> {

	

	



	

}
