package com.ricardo.workspring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardo.workspring.domain.User;
import com.ricardo.workspring.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	
	public User buscar(Integer id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
}
