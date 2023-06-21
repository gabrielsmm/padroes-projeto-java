package com.gabrielsmm.gof.estruturais.bridge.mvc.services;

import com.gabrielsmm.gof.estruturais.bridge.mvc.dao.UserDao;
import com.gabrielsmm.gof.estruturais.bridge.mvc.model.User;

public abstract class UserService {

    protected UserDao dao;

    public UserService(UserDao dao) {
        this.dao = dao;
    }

    public abstract void save(User user);

}
