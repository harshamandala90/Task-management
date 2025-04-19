package com.taskmanagement.tool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taskmanagement.tool.model.Notification;
import com.taskmanagement.tool.model.Project;

@Repository
public interface Jpanotificationrepository extends JpaRepository<Notification, Integer> {

}