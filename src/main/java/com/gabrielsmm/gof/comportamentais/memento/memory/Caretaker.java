package com.gabrielsmm.gof.comportamentais.memento.memory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Classe responsável por armazenar os Mementos (Snapshots)
public class Caretaker {

    private final List<Memento> mementos = new ArrayList<>();

    public Caretaker() {

    }

    public List<Memento> getHistoryList() {
        return Collections.unmodifiableList(mementos);
    }

    public void add(Memento memento) {
        mementos.add(memento);
    }

    public Memento get(int index) {
        return mementos.get(index);
    }

}
