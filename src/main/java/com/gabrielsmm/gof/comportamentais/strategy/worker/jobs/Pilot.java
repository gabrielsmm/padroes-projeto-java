package com.gabrielsmm.gof.comportamentais.strategy.worker.jobs;

import com.gabrielsmm.gof.comportamentais.strategy.worker.strategies.eat.MeatFoodStrategy;
import com.gabrielsmm.gof.comportamentais.strategy.worker.strategies.transportation.AirplaneStrategy;
import com.gabrielsmm.gof.comportamentais.strategy.worker.strategies.work.PilotStrategy;

public class Pilot implements Worker {

    @Override
    public void eat() {
        new MeatFoodStrategy().eat();
    }

    @Override
    public void move() {
        new AirplaneStrategy().move();
    }

    @Override
    public void work() {
        new PilotStrategy().work();
    }

}
