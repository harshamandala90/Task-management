package com.taskmanagement.tool.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanagement.tool.model.Comment;
import com.taskmanagement.tool.model.Task;
import com.taskmanagement.tool.model.User;
import com.taskmanagement.tool.service.Commentservice;

@RestController
public class Commentcontroller {

	@Autowired
    private Commentservice commentService;
	
	@PostMapping("/addcomment")
    @ResponseBody
     public String comments(@RequestBody Comment comment)
    {
		
		comment.setDate_created(LocalDateTime.now());
		commentService.addComment(comment);
        return "comment succcessfully added ";
        
    }
	
	@GetMapping("/getcommentsbytaskid/{taskId}")
    @ResponseBody
     public Optional<Comment> getuserbyid(@PathVariable int taskId)
    {
		Optional<Comment> commentList = commentService.getcommentstaskid(taskId);
		System.out.println("comment list size " + commentList.get());
        return commentList;
        
     
    }
	




	
	


	
	
}
