package com.capgemini.librarymanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.capgemini.librarymanagementsystem.beans.User;
import com.capgemini.librarymanagementsystem.exceptions.DeletionFailedException;
import com.capgemini.librarymanagementsystem.exceptions.StudentNotFoundException;
import com.capgemini.librarymanagementsystem.exceptions.UpdationFailedException;

public class AdminDaoImpl implements AdminDao{
	static EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("TestPersistence");
	EntityManager entityManager=null;
	EntityTransaction transaction=null;

	@Override
	public User addStudent(User user) {
		try {
			entityManager= entityManagerFactory.createEntityManager();
			transaction= entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(user);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();
		return user;
	}


	@Override
	public User addLibrarian(User user) {
		try {
			entityManager= entityManagerFactory.createEntityManager();
			transaction= entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(user);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();
		return user;
	}


	@Override
	public User deleteStudent(String id) throws DeletionFailedException {
		User user=null;
		try {
			entityManager= entityManagerFactory.createEntityManager();
			transaction= entityManager.getTransaction();
			transaction.begin();
			user=entityManager.find(User.class, id);
			entityManager.remove(user);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();
		return user;
	}


	@Override
	public User deleteLibrarian(String id) throws DeletionFailedException {
		User user=null;
		try {
			entityManager= entityManagerFactory.createEntityManager();
			transaction= entityManager.getTransaction();
			transaction.begin();
			user=entityManager.find(User.class, id);
			entityManager.remove(user);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();
		return user;
	}

	@Override
	public List<User> searchStudent(String id) throws StudentNotFoundException {
		entityManager= entityManagerFactory.createEntityManager();
		String jpql="from User where id=:id";
		Query query= entityManager.createQuery(jpql);
		query.setParameter("id", id);
		List<User> list= query.getResultList();
		return list;
	}


	@Override
	public List<User> displayStudent() {
		User user = new User();
		user.setRole("student");
		entityManager= entityManagerFactory.createEntityManager();
		String jpql="From User where role='student'";
		Query query= entityManager.createQuery(jpql);
		List<User> list= query.getResultList();
		return list;
	}


	@Override
	public Boolean updateStudent(User studentId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Boolean updateLibrarian(User librarianId) {
		// TODO Auto-generated method stub
		return null;
	}
}


