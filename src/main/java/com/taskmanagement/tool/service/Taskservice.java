package com.taskmanagement.tool.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Service;

import com.taskmanagement.tool.model.Task;
import com.taskmanagement.tool.model.User;
import com.taskmanagement.tool.repository.Jpataskrepository;
import com.taskmanagement.tool.repository.Jpauserrepository;

@Service
public class Taskservice {

	@Autowired
    private Jpataskrepository taskRepository;

	public void saveTask(Task task) {
		taskRepository.save(task);		
	}

	public List<Task> getAllUsers() {
        return taskRepository.findAll();
    }

	

	public void updateTask(Task task) {
		  taskRepository.save(task);
		}


	

	public Optional<Task> gettaskbyid(int taskid) {
		return taskRepository.findById(taskid);
	}

	public Optional<Task> gettaskbyuserid(int taskid) {
		return taskRepository.findById(taskid);
	}

	public void deleteTaskById(int taskid) {
		 taskRepository.deleteById(taskid);
	}

	
	

	
	
	
	


	
}
