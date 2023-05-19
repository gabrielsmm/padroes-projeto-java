package com.gabrielsmm.gof.criacionais.factory.apple.halfSimple.factory;

import com.gabrielsmm.gof.criacionais.factory.apple.halfSimple.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIPhone(String level) {
        IPhone device = null;

        device = createIPhone(level);

        if (device != null) {
            device.getHardware();
            device.assemble();
            device.certificates();
            device.pack();
        }

        return device;
    }

    protected abstract IPhone createIPhone(String level);

}
