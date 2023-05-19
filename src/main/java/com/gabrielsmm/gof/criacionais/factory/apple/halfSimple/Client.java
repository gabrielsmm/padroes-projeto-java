package com.gabrielsmm.gof.criacionais.factory.apple.halfSimple;

import com.gabrielsmm.gof.criacionais.factory.apple.halfSimple.factory.IPhone11Factory;
import com.gabrielsmm.gof.criacionais.factory.apple.halfSimple.factory.IPhoneXFactory;
import com.gabrielsmm.gof.criacionais.factory.apple.halfSimple.model.IPhone;

public class Client {

    public static void main(String[] args) {
        System.out.println("### Ordering an iPhone X");
        IPhone iPhone = new IPhoneXFactory().orderIPhone("standard");
        System.out.println(iPhone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iPhone2 = new IPhone11Factory().orderIPhone("highEnd");
        System.out.println(iPhone2);
    }

}
