package com.capgemini.librarymanagementsystem.service;

import com.capgemini.librarymanagementsystem.beans.BooksInventory;
import com.capgemini.librarymanagementsystem.beans.User;
import com.capgemini.librarymanagementsystem.dao.LibrarianDao;
import com.capgemini.librarymanagementsystem.dao.LibrarianDaoImpl;

public class LibrarianServiceImpl implements LibrarianService{
	LibrarianDao librarianDao=new LibrarianDaoImpl();

	@Override
	public Boolean addBook(BooksInventory booksInvent) {
		return librarianDao.addBook(booksInvent);
	}

	@Override
	public Boolean updateBook(BooksInventory booksInvent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteBook(String bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BooksInventory getBookRequest(BooksInventory booksInvent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean cancelBookRequest(String bookId, String bookName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User searchStudent(String studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteStudent(String studentId) {
		// TODO Auto-generated method stub
		return null;
	}

}
