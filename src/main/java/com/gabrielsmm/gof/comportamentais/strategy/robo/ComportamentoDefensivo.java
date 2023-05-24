package com.gabrielsmm.gof.comportamentais.strategy.robo;

public class ComportamentoDefensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente...");
    }

}
