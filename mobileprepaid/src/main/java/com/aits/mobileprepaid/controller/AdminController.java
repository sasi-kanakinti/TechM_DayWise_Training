package com.aits.mobileprepaid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aits.mobileprepaid.entity.User;
import com.aits.mobileprepaid.service.AdminService;
import com.aits.mobileprepaid.service.UserService;

@RestController
public class AdminController {

	
	@Autowired
	AdminService adminservice;
	
	@Autowired
	private UserService userservice;
	
	
	@GetMapping("/admin/usersexpiring")
	public List<User> getAllUsersExpiring(){
		
		
		return adminservice.getAllUsersExpiring();
	}
	
@GetMapping("/admin/users")
	
	public List<User> fetchAllUsers(){
		
		return userservice.fetchAllUsers();
	}
	
	
}
