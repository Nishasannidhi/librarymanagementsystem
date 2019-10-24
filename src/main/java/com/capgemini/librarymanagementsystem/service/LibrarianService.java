package com.capgemini.librarymanagementsystem.service;

import com.capgemini.librarymanagementsystem.beans.BooksInventory;
import com.capgemini.librarymanagementsystem.beans.User;

public interface LibrarianService {
	public Boolean addBook(BooksInventory booksInvent);
	public Boolean updateBook(BooksInventory booksInvent);
	public Boolean deleteBook(String bookId);
	public BooksInventory getBookRequest(BooksInventory booksInvent);
	public Boolean cancelBookRequest(String bookId, String bookName);
	public User searchStudent(String studentId);
	public Boolean deleteStudent(String studentId);

}
