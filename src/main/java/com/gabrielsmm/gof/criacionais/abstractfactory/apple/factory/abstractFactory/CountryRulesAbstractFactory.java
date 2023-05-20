package com.gabrielsmm.gof.criacionais.abstractfactory.apple.factory.abstractFactory;

import com.gabrielsmm.gof.criacionais.abstractfactory.apple.model.certificate.Certificate;
import com.gabrielsmm.gof.criacionais.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
