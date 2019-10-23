package com.capgemini.librarymanagementsystem.service;

import com.capgemini.librarymanagementsystem.beans.User;
import com.capgemini.librarymanagementsystem.dao.UserDao;
import com.capgemini.librarymanagementsystem.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
	UserDao userDao=new UserDaoImpl();

	@Override
	public User Login(User user) {
		return userDao.Login(user);
	}

}
