package com.example.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.entities.User;
import com.example.service.UserDAO;

@Component
public class UserDAOImpl implements UserDAO {
	@Autowired
	SessionFactory sessionFactory;
	public void saveUser(User user)
	{
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(user);
		session.flush();
		session.close();
		tx.commit();
	}
}
