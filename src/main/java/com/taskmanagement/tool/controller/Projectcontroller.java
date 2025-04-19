package com.taskmanagement.tool.controller;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanagement.tool.model.Project;
import com.taskmanagement.tool.service.Projectservice;

@RestController
public class Projectcontroller {

	@Autowired
	private Projectservice projectservice;
	
	@PostMapping("/createproject")
    @ResponseBody
     public String project(@RequestBody Project project)
    {
		System.out.println("projectId"+ project.getProjectid());
		project.setDateCreated(LocalDateTime.now());
		project.setDatemodified(LocalDateTime.now());
		projectservice.saveProject(project);
        return "project succcessfully created ";
        
    }
	
	@GetMapping("/getprojectbyid/{projectid}")
    @ResponseBody	
     public Optional<Project> getprojectbyid(@PathVariable int projectid)
    {
		Optional<Project> projectList = projectservice.getprojectbyid(projectid);
		System.out.println("project list size " + projectList.get());
        return projectList;
}
	@PutMapping("/updateprojectbyid")
    @ResponseBody
    public String updateprojectbyid(@RequestBody Project project)
    {
		project.setDateCreated(LocalDateTime.now());
		project.setDatemodified(LocalDateTime.now());
		projectservice.updateProject(project);
        return "project successfully updated ";
}
	
	@GetMapping("/getprojectsbyuserid/{userid}")
    @ResponseBody
     public Optional<Project> getprojectsbyuserid(@PathVariable int userid )
    {
		Optional<Project> projectList = projectservice.getprojectsbyuserid(userid);
		System.out.println("user list size " + projectList.get());
        return projectList;
        
    }
	
	@DeleteMapping("/deleteprojectbyid/{projectid}")
    public String deleteProjectTask(@PathVariable int projectid) {
        projectservice.deleteProjectById(projectid);
        return "project successfully deleted";
    }
}
