package com.gabrielsmm.gof;

import com.gabrielsmm.gof.facade.Facade;
import com.gabrielsmm.gof.singleton.SingletonEager;
import com.gabrielsmm.gof.singleton.SingletonLazy;
import com.gabrielsmm.gof.singleton.SingletonLazyHolder;
import com.gabrielsmm.gof.strategy.*;

public class Main {
    public static void main(String[] args) {

        // Criacional - Singleton: Sempre obter a mesma instância
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Comportamental - Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Estrutural - Facade
        Facade facade = new Facade();
        facade.migrarCliente("Gabriel", "74885230");
    }
}