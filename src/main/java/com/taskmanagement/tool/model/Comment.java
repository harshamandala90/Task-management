package com.taskmanagement.tool.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "comments")
public class Comment {

	
	
    @Column(name = "comment",nullable = false, unique = true)
    private String comment;
    
  
    @Column(name = "date_created",nullable = true, unique = true)
    private LocalDateTime date_created;
    
    @Column(name = "date_modified",nullable = true, unique = true)
    private LocalDateTime datemodified;
    
   
    @Id
    @Column(name = "task_id",nullable = true, unique = false)
    private Integer taskId;
    
    @Column(name = "project_id",nullable = true, unique = true)
    private Integer projectId;
    
    @Column(name = "comment_id",nullable = true, unique = false)
    private Integer commentId;

	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public Integer getProjectid() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}



	public String getComment() {
		return comment;
	}

	public void setCommentname(String commentname) {
		this.comment = comment;
	}



	
	public LocalDateTime getDate_created() {
		return date_created;
	}

	public void setDate_created(LocalDateTime date_created) {
		this.date_created = date_created;
	}

	public LocalDateTime getDatemodified() {
		return datemodified;
	}

	public void setDatemodified(LocalDateTime datemodified) {
		this.datemodified = datemodified;
	}



	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskid(Integer taskId) {
		this.taskId = taskId;
	}

	
	

	public void setProjectid1(Integer projectId) {
		this.projectId = projectId;
		
	}

	public void setComment(String comment) {
		this.comment = comment;
		
	}

	


	

	
    
}
