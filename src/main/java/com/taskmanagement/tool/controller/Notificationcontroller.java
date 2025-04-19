package com.taskmanagement.tool.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanagement.tool.model.Notification;
import com.taskmanagement.tool.model.Project;
import com.taskmanagement.tool.service.Notificationservice;
import com.taskmanagement.tool.service.Projectservice;

@RestController
public class Notificationcontroller {

	@Autowired
	private Notificationservice notificationservice;
	
	@PostMapping("/createnotification")
    @ResponseBody
    public String notification() {
    
    Notification notification = new Notification();
    notification.setNotificationid(1);
    notification.setNotificationname("getting ready");
    notification.setDateCreated(LocalDateTime.now());
    notification.setDatemodified(LocalDateTime.now());
    notification.setUserid(2009);
    notificationservice.saveNotification(notification);
    return "notification succcessfully created ";
	}
}

