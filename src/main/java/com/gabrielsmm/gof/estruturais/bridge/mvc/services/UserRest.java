package com.gabrielsmm.gof.estruturais.bridge.mvc.services;

import com.gabrielsmm.gof.estruturais.bridge.mvc.dao.UserDao;
import com.gabrielsmm.gof.estruturais.bridge.mvc.model.User;

public class UserRest extends UserService {

	public UserRest(UserDao dao) {
		super(dao);
	}

	@Override
	public void save(User user) {
		System.out.println("Starting a save operation through Rest Protocol!");
		dao.save(user);
	}

}
