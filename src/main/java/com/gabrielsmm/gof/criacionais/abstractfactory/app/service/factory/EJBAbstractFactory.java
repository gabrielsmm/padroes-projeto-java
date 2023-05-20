package com.gabrielsmm.gof.criacionais.abstractfactory.app.service.factory;

import com.gabrielsmm.gof.criacionais.abstractfactory.app.service.services.CarEJBService;
import com.gabrielsmm.gof.criacionais.abstractfactory.app.service.services.CarService;
import com.gabrielsmm.gof.criacionais.abstractfactory.app.service.services.UserEJBService;
import com.gabrielsmm.gof.criacionais.abstractfactory.app.service.services.UserService;

public class EJBAbstractFactory implements ServicesAbstractFactory {

    @Override
    public CarService getCarService() {
        return new CarEJBService();
    }

    @Override
    public UserService getUserService() {
        return new UserEJBService();
    }

}
