package com.gabrielsmm.gof.estruturais.mediator.translate.mediator;

import com.gabrielsmm.gof.estruturais.mediator.translate.model.User;
import com.gabrielsmm.gof.estruturais.mediator.translate.services.Translator;

public class TranslatorMediator extends Mediator {

    private Translator translator = new Translator();

    @Override
    protected String getMessage(String message, User to, User from) {
        return translator.getTranslation(from.getLanguage(), to.getLanguage(), message);
    }

}
