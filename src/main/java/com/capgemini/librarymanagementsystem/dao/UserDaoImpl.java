package com.capgemini.librarymanagementsystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.librarymanagementsystem.beans.User;

public class UserDaoImpl implements UserDao{
	static String id;
	private static EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");

	@Override
	public User Login(User user) {
		User user1=null;
		try {
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			Query query=entityManager.createQuery("FROM User WHERE id=:id and password=:password", User.class);
			this.id=user.getId();
			query.setParameter("id", user.getId());
			query.setParameter("password",user.getPassword());
			user=(User) query.getSingleResult();
			entityManager.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return user;
	}

}
