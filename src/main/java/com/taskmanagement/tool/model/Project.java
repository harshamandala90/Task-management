package com.taskmanagement.tool.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "project")
public class Project  {
	

	    
      
     	
	
	    
	    @Column(name = "project_id",nullable = false, unique = true)
	    private Integer projectid;
     	
	    
        @Column(name = "project_name",nullable = false, unique = true)
	    private String projectName;
        
        @Column(name = "status",nullable = false, unique = true)
	    private String status;
        
        @Column(name = "date_created",nullable = true, unique = true)
   	    private LocalDateTime  dateCreated;
        
        @Column(name = "date_modified",nullable = true, unique = true)
   	    private LocalDateTime  datemodified;
        
        @Id
        @Column(name = "user_id",nullable = false, unique = true)
	    private Integer userid;
  
		
		public Integer getUserid() {
			return userid;
		}

		public void setUserid(Integer userid) {
			this.userid = userid;
		}

		public int getProjectid() {
			return projectid;
		}

		public void setProjectid(int projectid) {
			this.projectid = projectid;
		}
		
		public String getProjectName() {
			return projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
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

		public LocalDateTime getDatemodified() {
			return datemodified;
		}

		public void setDatemodified(LocalDateTime datemodified) {
			this.datemodified = datemodified;
		}

	
}
