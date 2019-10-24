package com.capgemini.librarymanagementsystem.service;

import com.capgemini.librarymanagementsystem.beans.User;

public interface UserService {
	public User login(String id, String password);
	
}
