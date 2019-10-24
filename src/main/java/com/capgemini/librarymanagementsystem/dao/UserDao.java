package com.capgemini.librarymanagementsystem.dao;

import com.capgemini.librarymanagementsystem.beans.User;

public interface UserDao {
	public User login(String id, String password);
	

}
