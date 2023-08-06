package com.gabrielsmm.gof.comportamentais.strategy.person;

import com.gabrielsmm.gof.comportamentais.strategy.person.strategies.eat.EatStrategy;
import com.gabrielsmm.gof.comportamentais.strategy.person.strategies.transportation.TransportationStrategy;
import com.gabrielsmm.gof.comportamentais.strategy.person.strategies.work.WorkStrategy;

public class Person {

    private String name;
    private EatStrategy eatStrategy;
    private TransportationStrategy moveStrategy;
    private WorkStrategy workStrategy;

    public Person(String name, EatStrategy eatStrategy, TransportationStrategy moveStrategy, WorkStrategy workStrategy) {
        this.name = name;
        this.eatStrategy = eatStrategy;
        this.moveStrategy = moveStrategy;
        this.workStrategy = workStrategy;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        eatStrategy.eat();
    }

    public void move() {
        moveStrategy.move();
    }

    public void work() {
        workStrategy.work();
    }

}
