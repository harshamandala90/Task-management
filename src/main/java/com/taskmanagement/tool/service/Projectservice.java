package com.taskmanagement.tool.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskmanagement.tool.model.Project;
import com.taskmanagement.tool.model.Task;
import com.taskmanagement.tool.repository.Jpaprojectrepository;
import com.taskmanagement.tool.repository.Jpataskrepository;

@Service
public class Projectservice {

	@Autowired
    private Jpaprojectrepository projectRepository;
	
	public void saveProject(Project project) {
		projectRepository.save(project);		
	}

	public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

	public Optional<Project> getprojectbyid(int projectid) {
		return projectRepository.findById(projectid);
		
	}

	public void updateProject(Project project) {
		  projectRepository.save(project);
		}

	public Optional<Project> getprojectsbyuserid(int userid) {
		return projectRepository.findById(userid);
	}

	public void deleteProjectById(int projectid) {
		projectRepository.deleteById(projectid);		
	}
}
