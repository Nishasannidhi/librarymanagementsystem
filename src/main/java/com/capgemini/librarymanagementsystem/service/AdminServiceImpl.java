package com.capgemini.librarymanagementsystem.service;

import java.util.List;

import com.capgemini.librarymanagementsystem.beans.User;
import com.capgemini.librarymanagementsystem.dao.AdminDao;
import com.capgemini.librarymanagementsystem.dao.AdminDaoImpl;
import com.capgemini.librarymanagementsystem.exceptions.DeletionFailedException;
import com.capgemini.librarymanagementsystem.exceptions.StudentNotFoundException;
import com.capgemini.librarymanagementsystem.exceptions.UpdationFailedException;

public class AdminServiceImpl implements AdminService{
	AdminDao adminDao=new AdminDaoImpl();

	@Override
	public User addStudent(User user) {
		return adminDao.addStudent(user);
	}

	@Override
	public User addLibrarian(User user) {
		return adminDao.addLibrarian(user);
	}

	@Override
	public User deleteStudent(String studentId) throws DeletionFailedException {
		return adminDao.deleteStudent(studentId);
	}

	@Override
	public User deleteLibrarian(String librarianId) throws DeletionFailedException {
		return adminDao.deleteLibrarian(librarianId);
	}

	@Override
	public List<User> searchStudent(String id) throws StudentNotFoundException {
		return adminDao.searchStudent(id);
	}

	@Override
	public List<User> displayStudent() {
		return adminDao.displayStudent();
	}

	@Override
	public Boolean updateStudent(User studentId) {
		return adminDao.updateStudent(studentId);
	}

	@Override
	public Boolean updateLibrarian(User librarianId) {
		return adminDao.updateLibrarian(librarianId);
	}
}
