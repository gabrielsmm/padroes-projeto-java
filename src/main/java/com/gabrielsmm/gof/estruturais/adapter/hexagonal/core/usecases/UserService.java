package com.gabrielsmm.gof.estruturais.adapter.hexagonal.core.usecases;

import com.gabrielsmm.gof.estruturais.adapter.hexagonal.core.model.User;
import com.gabrielsmm.gof.estruturais.adapter.hexagonal.core.ports.UserRepository;

import java.util.List;

public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) {
        boolean alreadyUsedEmail = repository.getAll().stream()
                .anyMatch(userDb -> userDb.getEmail().equalsIgnoreCase(user.getEmail()));
        if (alreadyUsedEmail) throw new RuntimeException("Email address already exists!");
        repository.save(user);
    }

    public List<User> getUsers() {
        return repository.getAll();
    }

}
