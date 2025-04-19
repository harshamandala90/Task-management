package com.taskmanagement.tool.controller;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanagement.tool.model.Task;
import com.taskmanagement.tool.model.User;
import com.taskmanagement.tool.service.Taskservice;
import com.taskmanagement.tool.service.Userservice;

@RestController

public class Taskcontroller {

	@Autowired
    private Taskservice taskService;
	
	@PostMapping("/createtask")
    @ResponseBody
     public String task(@RequestBody Task task)
   
	{
		
		task.setDateCreated(LocalDateTime.now());
//		task.setDatemodified(LocalDateTime.now());
		taskService.saveTask(task);
        return "task succcessfully created ";
    }
	
	@GetMapping("/gettaskbyid/{taskid}")
    @ResponseBody
     public Optional<Task> gettaskbyid(@PathVariable int taskid)
     {
//		System.out.println("taskid"+ taskid);
 		Optional<Task> taskList = taskService.gettaskbyid(taskid);
 		System.out.println("task list size " + taskList.get());
         return taskList;
         
     }
	
	@PutMapping("/updatetaskbyid/{taskid}")
    @ResponseBody
    public String updatetaskbyid(@RequestBody Task task)
    {
		
		task.setDateCreated(LocalDateTime.now());
		task.setDateModified(LocalDateTime.now());
		taskService.updateTask(task);
        return "task successfully updated ";
}
	@GetMapping("/gettasksbyuserid")
    @ResponseBody
     public Optional<Task> gettasksbyuserid()
    {
		Optional<Task> taskList = taskService.gettaskbyuserid(1000);
		System.out.println("user list size " + taskList.get());
        return taskList;
        
    }
	
	@DeleteMapping("deletetaskbyid/{taskid}")
    public String deleteTask(@PathVariable int taskid) {
        taskService.deleteTaskById(taskid);
        return "task successfully deleted";
    }
}
