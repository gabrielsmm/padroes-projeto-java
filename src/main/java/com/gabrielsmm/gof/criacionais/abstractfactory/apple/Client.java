package com.gabrielsmm.gof.criacionais.abstractfactory.apple;

import com.gabrielsmm.gof.criacionais.abstractfactory.apple.factory.IPhone11Factory;
import com.gabrielsmm.gof.criacionais.abstractfactory.apple.factory.IPhoneXFactory;
import com.gabrielsmm.gof.criacionais.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import com.gabrielsmm.gof.criacionais.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import com.gabrielsmm.gof.criacionais.abstractfactory.apple.factory.abstractFactory.USRulesAbstractFactory;
import com.gabrielsmm.gof.criacionais.abstractfactory.apple.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {
		CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
//		CountryRulesAbstractFactory rules = new USRulesAbstractFactory();

		System.out.println("### Ordering an IPhone X");
		IPhone iPhone1 = new IPhoneXFactory(rules).orderIPhone("standard");
		System.out.println(iPhone1);

		System.out.println("### Ordering an IPhone 11 HighEnd");
		IPhone iPhone2 = new IPhone11Factory(rules).orderIPhone("highEnd");
		System.out.println(iPhone2);
	}
}
