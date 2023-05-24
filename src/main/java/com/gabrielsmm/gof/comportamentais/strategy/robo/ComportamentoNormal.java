package com.gabrielsmm.gof.comportamentais.strategy.robo;

public class ComportamentoNormal implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente...");
    }

}
