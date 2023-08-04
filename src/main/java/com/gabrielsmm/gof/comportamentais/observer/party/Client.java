package com.gabrielsmm.gof.comportamentais.observer.party;

import com.gabrielsmm.gof.comportamentais.observer.party.observers.Friend;
import com.gabrielsmm.gof.comportamentais.observer.party.observers.Wife;
import com.gabrielsmm.gof.comportamentais.observer.party.subject.Doorman;

public class Client {

    public static void main(String[] args) {
        Doorman doorman = new Doorman();
        doorman.add(new Wife());
        doorman.add(new Friend());

        doorman.setStatus(false);
        doorman.setStatus(false);
        doorman.setStatus(false);

        System.out.println("Husband is coming!");
        doorman.setStatus(true);
    }

}
