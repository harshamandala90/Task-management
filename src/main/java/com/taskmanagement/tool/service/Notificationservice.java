package com.taskmanagement.tool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskmanagement.tool.model.Notification;
import com.taskmanagement.tool.model.Project;
import com.taskmanagement.tool.repository.Jpanotificationrepository;
import com.taskmanagement.tool.repository.Jpaprojectrepository;

@Service
public class Notificationservice {

	@Autowired
    private Jpanotificationrepository notificationRepository;
	
	public void saveNotification(Notification notification) {
		notificationRepository.save(notification);		
	}
	
	
}
