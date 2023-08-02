package com.gabrielsmm.gof.estruturais.mediator.translate.mediator;

import com.gabrielsmm.gof.estruturais.mediator.translate.model.User;

public class ChatMediator extends Mediator {

    @Override
    protected String getMessage(String message, User to, User from) {
        return message;
    }

}
