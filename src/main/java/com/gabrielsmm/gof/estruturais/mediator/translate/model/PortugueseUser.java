package com.gabrielsmm.gof.estruturais.mediator.translate.model;

import com.gabrielsmm.gof.estruturais.mediator.translate.mediator.Mediator;

public class PortugueseUser extends User {

    public PortugueseUser(String name, Mediator mediator) {
        super(name, mediator, Language.PORTUGUESE);
    }
}
