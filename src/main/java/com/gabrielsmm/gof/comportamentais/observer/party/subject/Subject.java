package com.gabrielsmm.gof.comportamentais.observer.party.subject;

import com.gabrielsmm.gof.comportamentais.observer.party.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(boolean status) {
        for (Observer o : observers) {
            o.update(status);
        }
    }

}
