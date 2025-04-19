package com.taskmanagement.tool.model;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_role")


public class Role {
 
	

	@Id
    @Column(name = "user_id",nullable = false, unique = true)
    private Integer userid;
	

    @Column(name = "user_role",nullable = false, unique = true)
    private String userrole;
	
	@Column(name = "date_created",nullable = false, unique = true)
	    private LocalDateTime  dateCreated;
	
	@Column(name = "date_modified",nullable = true, unique = true)
	    private LocalDateTime  dateModified;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUserrole() {
		return userrole;
	}

	public void setUserrole(String userrole) {
		this.userrole = userrole;
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



	

	

}
