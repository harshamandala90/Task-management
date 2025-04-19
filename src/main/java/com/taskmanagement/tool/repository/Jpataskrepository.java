package com.taskmanagement.tool.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taskmanagement.tool.model.Task;




	@Repository
	public interface Jpataskrepository extends JpaRepository<Task, Integer> {

		

	    
	}

