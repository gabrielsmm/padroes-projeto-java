package com.gabrielsmm.gof.criacionais.factory.apple.halfSimple.factory;

import com.gabrielsmm.gof.criacionais.factory.apple.halfSimple.model.IPhone;
import com.gabrielsmm.gof.criacionais.factory.apple.halfSimple.model.IPhone11;
import com.gabrielsmm.gof.criacionais.factory.apple.halfSimple.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

    @Override
    public IPhone createIPhone(String level) {
        if ("standard".equals(level)) {
            return new IPhone11();
        } else if ("highEnd".equals(level)) {
            return new IPhone11Pro();
        } else return null;
    }

}
