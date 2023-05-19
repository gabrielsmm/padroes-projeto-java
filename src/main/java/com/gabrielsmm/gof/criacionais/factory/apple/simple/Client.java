package com.gabrielsmm.gof.criacionais.factory.apple.simple;

import com.gabrielsmm.gof.criacionais.factory.apple.simple.model.IPhone;
import com.gabrielsmm.gof.criacionais.factory.apple.simple.factory.IPhoneFactory;

public class Client {

    public static void main(String[] args) {
        IPhoneFactory iPhoneFactory = new IPhoneFactory();

        System.out.println("### Ordering an iPhone X");
        IPhone iPhone = iPhoneFactory.orderIPhone("X", "standard");
        System.out.println(iPhone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iPhone1 = iPhoneFactory.orderIPhone("11", "highEnd");
        System.out.println(iPhone1);
    }

}
