package com.taskmanagement.tool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taskmanagement.tool.model.Role;
import com.taskmanagement.tool.model.User;

@Repository
public interface Jparolerepository extends JpaRepository<Role, Integer> {

}

