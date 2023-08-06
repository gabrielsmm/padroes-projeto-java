package com.gabrielsmm.gof.comportamentais.strategy.worker;

import com.gabrielsmm.gof.comportamentais.strategy.worker.jobs.Developer;
import com.gabrielsmm.gof.comportamentais.strategy.worker.jobs.HipsterDeveloper;
import com.gabrielsmm.gof.comportamentais.strategy.worker.jobs.Pilot;
import com.gabrielsmm.gof.comportamentais.strategy.worker.jobs.Worker;

public class Client {

    public static void main(String[] args) {
        Worker jhon = new Developer();
        presentYourself(jhon, "Jhon");

        Worker anne = new Pilot();
        presentYourself(anne, "Anne");

        Worker carol = new HipsterDeveloper();
        presentYourself(carol, "Carol");
    }

    public static void presentYourself(Worker worker, String name) {
        System.out.println("Hi, I'm " + name);
        worker.eat();
        worker.move();
        worker.work();
        System.out.println("-----------------");
    }

}
