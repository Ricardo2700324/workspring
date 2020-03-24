package com.ricardo.workspring.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ricardo.workspring.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<User> listar() {
		
		User user1 = new User(1, "Ricardo", "ricardo@gmail.com");
		User user2 = new User(2, "Tamiris", "Tamiris@gmail.com");
		
		List<User> lista = new ArrayList<>();
		lista.add(user1);
		lista.add(user2);
				
		return lista;
	}
}
