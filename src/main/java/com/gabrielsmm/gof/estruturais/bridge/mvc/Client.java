package com.gabrielsmm.gof.estruturais.bridge.mvc;

import com.gabrielsmm.gof.estruturais.bridge.mvc.dao.UserMongoDao;
import com.gabrielsmm.gof.estruturais.bridge.mvc.dao.UserMysqlDao;
import com.gabrielsmm.gof.estruturais.bridge.mvc.dao.UserOracleDao;
import com.gabrielsmm.gof.estruturais.bridge.mvc.dao.UserPostgresDao;
import com.gabrielsmm.gof.estruturais.bridge.mvc.model.User;
import com.gabrielsmm.gof.estruturais.bridge.mvc.services.UserEJB;
import com.gabrielsmm.gof.estruturais.bridge.mvc.services.UserRest;
import com.gabrielsmm.gof.estruturais.bridge.mvc.services.UserService;
import com.gabrielsmm.gof.estruturais.bridge.mvc.services.UserSoap;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		User user = new User("user", "user@email.com", "passwd");

		UserService userRestOracleService = new UserRest(new UserOracleDao());
		userRestOracleService.save(user);

		UserService userEJBMongoService = new UserEJB(new UserMongoDao());
		userEJBMongoService.save(user);

		UserService userSoapPostgresService = new UserSoap(new UserPostgresDao());
		userSoapPostgresService.save(user);

		UserService userRestMysqlService = new UserRest(new UserMysqlDao());
		userRestMysqlService.save(user);
	}
}
