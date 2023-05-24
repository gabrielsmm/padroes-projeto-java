package com.gabrielsmm.gof.comportamentais.strategy.robo;

public class ComportamentoAgressivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }

}
