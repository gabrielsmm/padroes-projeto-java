package com.gabrielsmm.gof.estruturais.mediator.translate.model;

import com.gabrielsmm.gof.estruturais.mediator.translate.mediator.Mediator;

public class EnglishUser extends User {

    public EnglishUser(String name, Mediator mediator) {
        super(name, mediator, Language.ENGLISH);
    }

}
