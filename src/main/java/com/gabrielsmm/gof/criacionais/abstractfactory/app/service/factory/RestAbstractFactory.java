package com.gabrielsmm.gof.criacionais.abstractfactory.app.service.factory;

import com.gabrielsmm.gof.criacionais.abstractfactory.app.service.services.CarRestApiService;
import com.gabrielsmm.gof.criacionais.abstractfactory.app.service.services.CarService;
import com.gabrielsmm.gof.criacionais.abstractfactory.app.service.services.UserRestApiService;
import com.gabrielsmm.gof.criacionais.abstractfactory.app.service.services.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory {

    @Override
    public CarService getCarService() {
        return new CarRestApiService();
    }

    @Override
    public UserService getUserService() {
        return new UserRestApiService();
    }

}
