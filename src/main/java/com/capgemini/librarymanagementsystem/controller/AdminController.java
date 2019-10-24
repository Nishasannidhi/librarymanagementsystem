package com.capgemini.librarymanagementsystem.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.librarymanagementsystem.beans.User;
import com.capgemini.librarymanagementsystem.exceptions.DeletionFailedException;
import com.capgemini.librarymanagementsystem.exceptions.StudentNotFoundException;
import com.capgemini.librarymanagementsystem.exceptions.UpdationFailedException;
import com.capgemini.librarymanagementsystem.service.AdminService;
import com.capgemini.librarymanagementsystem.service.AdminServiceImpl;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials ="true")
public class AdminController {
	AdminService serviceAdmin= new AdminServiceImpl();

	@PostMapping("/addStudent")
	public User addStudent(@RequestBody User user) {
		user.setRole("student");
		User user2=null;
		user2=serviceAdmin.addStudent(user);
		return user2;
	}


	@PostMapping("/addLibrarian")
	public User addLibrarian(@RequestBody User user) {
		user.setRole("librarian");
		User user2=null;
		user2=serviceAdmin.addLibrarian(user);
		return user2;
	}

	@DeleteMapping("/deleteStudent/{id}")
	public User deleteStudent(@PathVariable("id")String id) {
		User user2=null;
		try {
			user2=serviceAdmin.deleteStudent(id);
		} catch (DeletionFailedException e) {
			e.printStackTrace();
		}
		return user2;
	}

	@DeleteMapping("/deleteLibrarian/{id}")
	public User deleteLibrarian(@PathVariable("id")String id) {
		User user2=null;
		try {
			user2=serviceAdmin.deleteLibrarian(id);
		} catch (DeletionFailedException e) {
			e.printStackTrace();
		}
		return user2;
	}

	
	
	@GetMapping("/searchStudent/{id}")
	public List<User> searchStudent(@PathVariable("id")String id){
		List<User> list=null;
		try {
			list=serviceAdmin.searchStudent(id);
		}catch (StudentNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	@GetMapping("/displayStudent")
	public List<User> displayStudent() {
		List<User> list= serviceAdmin.displayStudent();
		return list;
	}

}
