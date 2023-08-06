package com.gabrielsmm.gof.comportamentais.strategy.worker.jobs;

import com.gabrielsmm.gof.comportamentais.strategy.worker.strategies.eat.MeatFoodStrategy;
import com.gabrielsmm.gof.comportamentais.strategy.worker.strategies.transportation.CarStrategy;
import com.gabrielsmm.gof.comportamentais.strategy.worker.strategies.work.DeveloperStrategy;

public class Developer implements Worker {

    @Override
    public void eat() {
        new MeatFoodStrategy().eat();
    }

    @Override
    public void move() {
        new CarStrategy().move();
    }

    @Override
    public void work() {
        new DeveloperStrategy().work();
    }

}
