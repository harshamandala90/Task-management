package com.taskmanagement.tool.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanagement.tool.dto.Userdetailsdto;
import com.taskmanagement.tool.model.Role;
import com.taskmanagement.tool.model.User;
import com.taskmanagement.tool.model.Userdetails;
import com.taskmanagement.tool.repository.Jpauserrepository;
import com.taskmanagement.tool.service.Userservice;

@RestController
public class Usercontroller {

	@Autowired
    private Userservice userService;
	


	@PostMapping("/auth/registeruser")
    @ResponseBody
     public String userregistration(@RequestBody Userdetailsdto userdetailsdto)
    {
//		System.out.println("userId"+ user.getUserid());
		Userdetails userDetails = new Userdetails();
		User user =new User();
		user.setFirstName(userdetailsdto.getFirstName());
		user.setLastName(userdetailsdto.getLastName());
		user.setDateCreated(LocalDateTime.now());
		userDetails.setUsername(userdetailsdto.getUsername());
		userDetails.setPassword(userdetailsdto.getPassword());
		userDetails.setRoles(userdetailsdto.getRoles());
		userDetails.setUser(user);
		user.setUserDetails(userDetails);
		userService.saveUser(user);
        return "user succcessfully registered ";
        
    }
	
	@GetMapping("/getuserbyid/{userid}")
    @ResponseBody
     public Optional<User> getuserbyid(@PathVariable int userid)
    {
		Optional<User> userList = userService.getbyuserid(userid);
		System.out.println("user list size " + userList.get());
        return userList;
        
     
    }
	


	@PatchMapping("/assignroletouser/{userid}")
    @ResponseBody
     public String assignroletouser(@RequestBody Userdetailsdto userdetailsdto,@PathVariable int userid)
    {
		Optional<Userdetails> userdetailslist = userService.findbyuserid(userid);
		
		System.out.println("user details list" + userdetailslist.isPresent());
		System.out.println("user details list"+ userdetailslist.get().getUsername());
		Userdetails userdetails = new Userdetails();
		userdetails.setId(userid);
		userdetails.setUsername(userdetailslist.get().getUsername());
		userdetails.setPassword(userdetailslist.get().getPassword());
		userdetails.setRoles(userdetailsdto.getRoles());
		userService.saveRole(userdetails);
        return "role successfully assigned ";
}	
	
	@PatchMapping("/updateuserbyid/{userid}")
    @ResponseBody
    public String updateuserbyid(@RequestBody Userdetailsdto userdetailsdto,@PathVariable int userid)
    {
		User user = new User();
		user.setUserid(userid);
		user.setFirstName(userdetailsdto.getFirstName());
		user.setLastName(userdetailsdto.getLastName());
		user.setDateCreated(LocalDateTime.now());
		user.setDatemodified(LocalDateTime.now());
		userService.updateUser(user);
        return "user successfully updated ";
}
	
	@DeleteMapping("deleteuserbyid/{userid}")
    public String deleteTask(@PathVariable int userid) {
        userService.deleteUserById(userid);
        return "user successfully deleted";
    }
	
	
}
