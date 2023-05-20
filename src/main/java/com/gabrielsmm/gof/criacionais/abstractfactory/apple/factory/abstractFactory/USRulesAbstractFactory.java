package com.gabrielsmm.gof.criacionais.abstractfactory.apple.factory.abstractFactory;

import com.gabrielsmm.gof.criacionais.abstractfactory.apple.model.certificate.Certificate;
import com.gabrielsmm.gof.criacionais.abstractfactory.apple.model.certificate.USCertificate;
import com.gabrielsmm.gof.criacionais.abstractfactory.apple.model.packing.Packing;
import com.gabrielsmm.gof.criacionais.abstractfactory.apple.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

    @Override
    public Certificate getCertificates() {
        return new USCertificate();
    }

    @Override
    public Packing getPacking() {
        return new USPacking();
    }

}
