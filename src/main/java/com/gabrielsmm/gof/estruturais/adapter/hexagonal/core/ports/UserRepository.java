package com.gabrielsmm.gof.estruturais.adapter.hexagonal.core.ports;

import com.gabrielsmm.gof.estruturais.adapter.hexagonal.core.model.User;

import java.util.List;

public interface UserRepository {
	void save(User user);
    List<User> getAll();
}
