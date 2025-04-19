package com.taskmanagement.tool.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "task")
public class Task {
	
	
	
	@Id
    @Column(name = "task_id",nullable = true, unique = true)
    private Integer taskId;
    
    @Column(name = "task_name",nullable = false, unique = true)
    private String taskName;
    
    
    @Column(name = "comments",nullable = false, unique = true)
    private String comments;
    
    @Column(name = "status",nullable = false, unique = false)
    private String status;
    
    @Column(name = "date_created",nullable = true, unique = false)
    private LocalDateTime dateCreated;
    
    @Column(name = "date_modified",nullable = true, unique = true)
    private LocalDateTime dateModified;
    
    
    @Column(name = "user_id",nullable = true, unique = true)
    private Integer userId;


	public Integer getTaskId() {
		return taskId;
	}


	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}


	public String getTaskName() {
		return taskName;
	}


	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public LocalDateTime getDateCreated() {
		return dateCreated;
	}


	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}


	public LocalDateTime getDateModified() {
		return dateModified;
	}


	public void setDateModified(LocalDateTime dateModified) {
		this.dateModified = dateModified;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}
    
    


} 

 
    




