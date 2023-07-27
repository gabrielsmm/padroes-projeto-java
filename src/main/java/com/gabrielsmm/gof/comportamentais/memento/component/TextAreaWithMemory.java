package com.gabrielsmm.gof.comportamentais.memento.component;

import com.gabrielsmm.gof.comportamentais.memento.memory.Memento;

import javax.swing.*;

public class TextAreaWithMemory extends JTextArea {

    public TextAreaWithMemory(int rows, int columns) {
        super(rows, columns);
    }

    public TextAreaMemento save() {
        return new TextAreaMemento(getText());
    }

    public void restore(TextAreaMemento memento) {
        setText(memento.getState());
    }

    public static class TextAreaMemento implements Memento {

        private String text;

        public TextAreaMemento(String text) {
            this.text = text;
        }

        public String getState() {
            return this.text;
        }

    }

}
