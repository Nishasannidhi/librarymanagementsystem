package com.capgemini.librarymanagementsystem.service;

import java.util.List;

import com.capgemini.librarymanagementsystem.beans.User;
import com.capgemini.librarymanagementsystem.exceptions.DeletionFailedException;
import com.capgemini.librarymanagementsystem.exceptions.StudentNotFoundException;

public interface AdminService {
	User addStudent(User user);
	User addLibrarian(User user);
	User deleteStudent(String studentId) throws DeletionFailedException;
	User deleteLibrarian(String librarianId) throws DeletionFailedException;
	public Boolean updateStudent(User studentId);
	public Boolean updateLibrarian(User librarianId);
	List<User> searchStudent(String id) throws StudentNotFoundException;
	List<User> displayStudent();
}
