package com.example.service;

import org.springframework.stereotype.Component;

import com.example.entities.*;

@Component
public interface UserDAO {
	public void saveUser(User user);
}
