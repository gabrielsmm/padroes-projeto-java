package com.gabrielsmm.gof.comportamentais.strategy.person;

import com.gabrielsmm.gof.comportamentais.strategy.person.strategies.eat.MeatFoodStrategy;
import com.gabrielsmm.gof.comportamentais.strategy.person.strategies.eat.VeggieFoodStrategy;
import com.gabrielsmm.gof.comportamentais.strategy.person.strategies.transportation.AirplaneStrategy;
import com.gabrielsmm.gof.comportamentais.strategy.person.strategies.transportation.BikeStrategy;
import com.gabrielsmm.gof.comportamentais.strategy.person.strategies.transportation.CarStrategy;
import com.gabrielsmm.gof.comportamentais.strategy.person.strategies.transportation.WalkStrategy;
import com.gabrielsmm.gof.comportamentais.strategy.person.strategies.work.DeveloperStrategy;
import com.gabrielsmm.gof.comportamentais.strategy.person.strategies.work.NoWorkStrategy;
import com.gabrielsmm.gof.comportamentais.strategy.person.strategies.work.PilotStrategy;

public class Client {

    public static void main(String[] args) {
        Person jhon = new Person("Jhon", new MeatFoodStrategy(), new CarStrategy(), new DeveloperStrategy());
        presentYourself(jhon);

        Person anne = new Person("Anne", new MeatFoodStrategy(),
                new AirplaneStrategy(), new PilotStrategy());
        presentYourself(anne);

        Person carol = new Person("Carol", new VeggieFoodStrategy(),
                new BikeStrategy(), new DeveloperStrategy());
        presentYourself(carol);

        Person alan = new Person("Alan", new VeggieFoodStrategy(),
                new WalkStrategy(), new NoWorkStrategy());
        presentYourself(alan);
    }

    public static void presentYourself(Person person) {
        System.out.println("Hi, I'm " + person.getName());
        person.eat();
        person.move();
        person.work();
        System.out.println("-----------------");
    }

}
