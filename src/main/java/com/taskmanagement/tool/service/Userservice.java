package com.taskmanagement.tool.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskmanagement.tool.model.Role;
import com.taskmanagement.tool.model.User;
import com.taskmanagement.tool.model.Userdetails;
import com.taskmanagement.tool.repository.Jparolerepository;
import com.taskmanagement.tool.repository.Jpauserrepository;
import com.taskmanagement.tool.repository.UserRepository;

@Service
public class Userservice {
	@Autowired
    private Jpauserrepository userRepository;
	@Autowired
	private UserRepository userRepo;

	public List<User> getAllUsers() {
        return userRepository.findAll();
    }
	
	public Optional<Userdetails> findbyuserid(int userid) {
        return userRepo.findById(userid);
        
    }
	
	public Optional<User> getbyuserid(int userid) {
        return userRepository.findById(userid);
        
    }
	public void saveUser(User user) {
         userRepository.save(user);
        
         
    }
	
	public void saveRole(Userdetails userdetails) {
		userRepo.save(userdetails);
	}
	
	public void updateUser(User user) {
	  userRepository.save(user);
	}

	public void deleteUserById(int userid) {
		userRepository.deleteById(userid);
		
	}
	
	}

		
		

