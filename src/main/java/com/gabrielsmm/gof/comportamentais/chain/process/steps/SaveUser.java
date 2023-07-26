package com.gabrielsmm.gof.comportamentais.chain.process.steps;

import com.gabrielsmm.gof.comportamentais.chain.process.repository.UserRepository;
import com.gabrielsmm.gof.comportamentais.chain.process.service.ProcessContext;

import java.util.HashMap;
import java.util.Map;

public class SaveUser extends ProcessStep {

    public SaveUser(Object... args) {
        super(args);
    }

    @Override
    public ProcessContext execute(ProcessContext context) throws Exception {
        Map<String, Object> userInput = new HashMap<>();
        userInput.put("name", context.get("name"));
        userInput.put("email", context.get("email"));
        userInput.put("password", context.get("password"));
        UserRepository.getInstance().saveUser(userInput);
        return next(context, String.format("User '%s' saved!", userInput.get("name")));
    }
}
