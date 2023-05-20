package com.gabrielsmm.gof.criacionais.abstractfactory.app.service;

import com.gabrielsmm.gof.criacionais.abstractfactory.app.service.factory.EJBAbstractFactory;
import com.gabrielsmm.gof.criacionais.abstractfactory.app.service.factory.RestAbstractFactory;
import com.gabrielsmm.gof.criacionais.abstractfactory.app.service.factory.ServicesAbstractFactory;
import com.gabrielsmm.gof.criacionais.abstractfactory.app.service.services.CarService;
import com.gabrielsmm.gof.criacionais.abstractfactory.app.service.services.UserService;

public class Client {

	public static void main(String[] args) {
		// Rest
		ServicesAbstractFactory service1 = new RestAbstractFactory();
		CarService carService = service1.getCarService();
		carService.save("Prius");
		carService.update("Tesla X");

		// EJB
		ServicesAbstractFactory service2 = new EJBAbstractFactory();
		UserService userService = service2.getUserService();
		userService.save("Jorge");
		userService.delete(5);
	}
}
