package com.gabrielsmm.gof.criacionais.abstractfactory.apple.model.certificate;

public class BrazilianCertificate implements Certificate {

	public String applyCertification() {
		return "\t- Calibrating Brazilian rules\n\t- Applying Anatel's Stamp";
	}

}
