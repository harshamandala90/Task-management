package com.taskmanagement.tool.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskmanagement.tool.model.Comment;
import com.taskmanagement.tool.model.User;
import com.taskmanagement.tool.repository.Jpacommentrepository;

@Service
public class Commentservice {

	@Autowired
    private Jpacommentrepository commentRepository;
	
	public List<Comment> getAllComments() {
        return commentRepository.findAll();
        
        
    }

	public Comment addComment(Comment request) {


	    return commentRepository.save(request);
	}

	public Optional<Comment> getcommentstaskid(int taskId) {
		return commentRepository.findById(taskId);
	}


	
	
	

	}

	

	

