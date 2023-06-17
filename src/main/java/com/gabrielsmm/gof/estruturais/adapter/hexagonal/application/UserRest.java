package com.gabrielsmm.gof.estruturais.adapter.hexagonal.application;

import com.gabrielsmm.gof.estruturais.adapter.hexagonal.core.model.User;
import com.gabrielsmm.gof.estruturais.adapter.hexagonal.core.ports.UserRepository;
import com.gabrielsmm.gof.estruturais.adapter.hexagonal.core.usecases.UserService;
import com.gabrielsmm.gof.estruturais.adapter.hexagonal.infrastructure.UserMemoryDatabaseAdapter;

import java.util.List;
import java.util.Map;

public class UserRest {

	private UserService service;

	public UserRest() {
		UserRepository repository = new UserMemoryDatabaseAdapter();
		service = new UserService(repository);
	}

	public Integer post(Map<String, String> values) {
		try {
			User user = new User(values.get("name"), values.get("email"), values.get("password"));
			service.saveUser(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 400;
		}
		return 201;
	}
	
	public Integer get() {
		List<User> users = service.getUsers();
		users.forEach(System.out::println);
		return 200;
	}
}
