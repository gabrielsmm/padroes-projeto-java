package com.gabrielsmm.gof.estruturais.adapter.hexagonal.infrastructure;

import com.gabrielsmm.gof.estruturais.adapter.hexagonal.core.model.User;
import com.gabrielsmm.gof.estruturais.adapter.hexagonal.core.ports.UserRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMemoryDatabaseAdapter implements UserRepository {

    private Map<String, User> memoryUsers = new HashMap<>();

    @Override
    public void save(User user) {
        memoryUsers.put(user.getEmail(), user);
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(memoryUsers.values());
    }

}
