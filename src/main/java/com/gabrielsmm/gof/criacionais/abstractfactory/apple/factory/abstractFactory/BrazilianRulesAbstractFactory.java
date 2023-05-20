package com.gabrielsmm.gof.criacionais.abstractfactory.apple.factory.abstractFactory;

import com.gabrielsmm.gof.criacionais.abstractfactory.apple.model.certificate.BrazilianCertificate;
import com.gabrielsmm.gof.criacionais.abstractfactory.apple.model.certificate.Certificate;
import com.gabrielsmm.gof.criacionais.abstractfactory.apple.model.packing.BrazilianPacking;
import com.gabrielsmm.gof.criacionais.abstractfactory.apple.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

    @Override
    public Certificate getCertificates() {
        return new BrazilianCertificate();
    }

    @Override
    public Packing getPacking() {
        return new BrazilianPacking();
    }

}
