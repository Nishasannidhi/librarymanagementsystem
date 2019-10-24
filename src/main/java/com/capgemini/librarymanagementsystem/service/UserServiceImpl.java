package com.capgemini.librarymanagementsystem.service;

import com.capgemini.librarymanagementsystem.beans.User;
import com.capgemini.librarymanagementsystem.dao.UserDao;
import com.capgemini.librarymanagementsystem.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
	UserDao userDao=new UserDaoImpl();

	@Override
	public User login(String id, String password) {
		return userDao.login(id, password);
	}

}
