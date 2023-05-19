package com.gabrielsmm.gof.criacionais.factory.apple.halfSimple.factory;

import com.gabrielsmm.gof.criacionais.factory.apple.halfSimple.model.IPhone;
import com.gabrielsmm.gof.criacionais.factory.apple.halfSimple.model.IPhoneX;
import com.gabrielsmm.gof.criacionais.factory.apple.halfSimple.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

    @Override
    public IPhone createIPhone(String level) {
        if ("standard".equals(level)) {
            return new IPhoneX();
        } else if ("highEnd".equals(level)) {
            return new IPhoneXSMax();
        } else return null;
    }

}
