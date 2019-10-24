package com.capgemini.librarymanagementsystem.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.librarymanagementsystem.beans.BooksInventory;
import com.capgemini.librarymanagementsystem.beans.User;
import com.capgemini.librarymanagementsystem.service.LibrarianService;
import com.capgemini.librarymanagementsystem.service.LibrarianServiceImpl;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials ="true")
public class LibrarianController {
	LibrarianService serviceLibrarian=new LibrarianServiceImpl();
	
	

}
