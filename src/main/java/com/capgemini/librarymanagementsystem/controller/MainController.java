package com.capgemini.librarymanagementsystem.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.capgemini.librarymanagementsystem.beans.User;
import com.capgemini.librarymanagementsystem.service.UserService;
import com.capgemini.librarymanagementsystem.service.UserServiceImpl;
@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*",allowCredentials = "true")
public class MainController {
UserService serviceUser= new UserServiceImpl();

	
	@PostMapping("/login/{id}/{password}")
	public User login(@PathVariable("id")String id,@PathVariable("password") String password, HttpServletRequest req) {

		User user = null;
		user = serviceUser.login(id, password);
		
		return user;
		
	}// End of login()
	
	@GetMapping("/logout")
	public ModelAndView logOut(ModelAndView modelAndView,HttpSession session) {
		session.invalidate();
		modelAndView.setViewName("index");

		return modelAndView;
	}//end of getLoginForm()
	
}
