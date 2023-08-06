package com.gabrielsmm.gof.comportamentais.strategy.worker.jobs;

import com.gabrielsmm.gof.comportamentais.strategy.worker.strategies.eat.VeggieFoodStrategy;
import com.gabrielsmm.gof.comportamentais.strategy.worker.strategies.transportation.BikeStrategy;
import com.gabrielsmm.gof.comportamentais.strategy.worker.strategies.work.DeveloperStrategy;

public class HipsterDeveloper implements Worker {

    @Override
    public void eat() {
        new VeggieFoodStrategy().eat();
    }

    @Override
    public void move() {
        new BikeStrategy().move();
    }

    @Override
    public void work() {
        new DeveloperStrategy().work();
    }

}
