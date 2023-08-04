package com.gabrielsmm.gof.comportamentais.observer.swing;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {

    private int count;
    private String text;

    public Label(String text) {
        this.count = 0;
        this.text = text;

        setFont(new Font(getFont().getName(), Font.BOLD, 30));
        increment();
    }

    public void increment() {
        setText(String.format("%s (%d)", text, count));
        this.count++;
    }

}
