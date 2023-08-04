package com.gabrielsmm.gof.comportamentais.observer.swing;

import javax.swing.*;

public class Button extends JButton {

    public Button(String text, Label... labels) {
        setText(text);

        addActionListener(e -> {
            for (Label label: labels) {
                label.increment();
            }
        });
    }

}
