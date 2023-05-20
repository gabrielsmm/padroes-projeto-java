package com.gabrielsmm.gof.criacionais.abstractfactory.apple.factory;

import com.gabrielsmm.gof.criacionais.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import com.gabrielsmm.gof.criacionais.abstractfactory.apple.model.iphone.IPhone;
import com.gabrielsmm.gof.criacionais.abstractfactory.apple.model.iphone.IPhoneX;
import com.gabrielsmm.gof.criacionais.abstractfactory.apple.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhoneXFactory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	protected IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX(rules);
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax(rules);
		} else return null;
	}

}
