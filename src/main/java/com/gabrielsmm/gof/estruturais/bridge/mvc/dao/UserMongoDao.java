package com.gabrielsmm.gof.estruturais.bridge.mvc.dao;

import com.gabrielsmm.gof.estruturais.bridge.mvc.model.User;

public class UserMongoDao implements UserDao {

	@Override
	public void save(User user) {
		System.out.println("Saving the user in the Mongo Database!");
	}

}
