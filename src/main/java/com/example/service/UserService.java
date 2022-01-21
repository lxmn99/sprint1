package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.example.entities.User;


@Component
public class UserService {
	@Autowired
	UserDAO usersDAOImpl;
	
	public void save(User user)
	{
		usersDAOImpl.saveUser(user);
	}

}
