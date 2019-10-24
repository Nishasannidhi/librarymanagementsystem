package com.capgemini.librarymanagementsystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.librarymanagementsystem.beans.BooksInventory;
import com.capgemini.librarymanagementsystem.beans.User;

public class LibrarianDaoImpl implements LibrarianDao{
	static EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("TestPersistence");
	EntityManager entityManager=null;
	EntityTransaction transaction=null;

	@Override
	public Boolean addBook(BooksInventory booksInvent) {
		try {
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(booksInvent);
			transaction.commit();
			entityManager.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
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
