package com.capgemini.librarymanagementsystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.capgemini.librarymanagementsystem.beans.User;

public class UserDaoImpl implements UserDao{
		static String id;
		static EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		
		@Override
		public User login(String id, String password){
			UserDaoImpl.id=id;
			User user=null;
			try {
				entityManager= entityManagerFactory.createEntityManager();
				transaction= entityManager.getTransaction();
				transaction.begin();
				user=entityManager.find(User.class, id);
				transaction.commit();

				if(user.getPassword().equals(password) && user.getId()==id){
					return user;
				}else {
					user=null;
				}
			} catch (Exception e) {
				transaction.rollback();
				e.printStackTrace();
			}
			entityManager.close();
			return user;
		}
	}
	

