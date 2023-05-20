package com.gabrielsmm.gof.criacionais.abstractfactory.app.service.factory;

import com.gabrielsmm.gof.criacionais.abstractfactory.app.service.services.CarService;
import com.gabrielsmm.gof.criacionais.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {

    CarService getCarService();

    UserService getUserService();

}
