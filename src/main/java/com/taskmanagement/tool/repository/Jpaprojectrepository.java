package com.taskmanagement.tool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taskmanagement.tool.model.Project;
import com.taskmanagement.tool.model.User;

@Repository
public interface Jpaprojectrepository extends JpaRepository<Project, Integer> {

}