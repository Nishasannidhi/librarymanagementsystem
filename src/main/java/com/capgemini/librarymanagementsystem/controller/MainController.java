package com.capgemini.librarymanagementsystem.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.librarymanagementsystem.beans.User;
import com.capgemini.librarymanagementsystem.service.UserService;
import com.capgemini.librarymanagementsystem.service.UserServiceImpl;
import com.capgemini.librarymanagementsystem.util.UserResponse;
@RestController
public class MainController {
	UserService userService=new UserServiceImpl();
	@PostMapping(path = "/login", consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse adminLogin(@RequestBody User user) {
		
		 user =  userService.Login(user);

		UserResponse response = new UserResponse();
		if(user!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Login  Successfully");
			response.setUser(user);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Invalid Credentials");
		}
		return response;
}
}
