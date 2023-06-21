package com.gabrielsmm.gof.estruturais.bridge.mvc.services;

import com.gabrielsmm.gof.estruturais.bridge.mvc.dao.UserDao;
import com.gabrielsmm.gof.estruturais.bridge.mvc.model.User;

public class UserEJB extends UserService {

	public UserEJB(UserDao dao) {
		super(dao);
	}

	@Override
	public void save(User user) {
		System.out.println("Starting a save operation through EJB Protocol!");
		dao.save(user);
	}

}
