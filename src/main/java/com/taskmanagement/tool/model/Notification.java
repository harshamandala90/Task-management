package com.taskmanagement.tool.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "notifications")
public class Notification {

	
    @Column(name = "user_id",nullable = false, unique = true)
    private Integer userid;

    @Id
    @Column(name = "notification_id",nullable = false, unique = true)
    private Integer notificationid;
    
    @Column(name = "notification_name",nullable = false, unique = true)
    private String notificationname;
    
    @Column(name = "date_created",nullable = false, unique = true)
	    private LocalDateTime  dateCreated;
    
    @Column(name = "date_modified",nullable = false, unique = true)
	    private LocalDateTime  datemodified;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getNotificationid() {
		return notificationid;
	}

	public void setNotificationid(Integer notificationid) {
		this.notificationid = notificationid;
	}

	public String getNotificationname() {
		return notificationname;
	}

	public void setNotificationname(String notificationname) {
		this.notificationname = notificationname;
	}

	public LocalDateTime getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}

	public LocalDateTime getDatemodified() {
		return datemodified;
	}

	public void setDatemodified(LocalDateTime datemodified) {
		this.datemodified = datemodified;
	}

	
}
