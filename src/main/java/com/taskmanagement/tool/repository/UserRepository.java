package com.taskmanagement.tool.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taskmanagement.tool.model.User;
import com.taskmanagement.tool.model.Userdetails;

@Repository
public interface UserRepository extends JpaRepository<Userdetails, Integer> {
    Optional<Userdetails> findByUsername(String username);
    Optional<Userdetails> findByid(int userid);
}

