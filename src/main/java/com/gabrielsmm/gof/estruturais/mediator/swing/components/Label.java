package com.gabrielsmm.gof.estruturais.mediator.swing.components;

import com.gabrielsmm.gof.estruturais.mediator.swing.mediator.Mediator;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {

    private Mediator mediator;

    public Label(Mediator mediator) {
        super("Times clicked: 0");
        setFont(new Font(getFont().getName(), Font.BOLD, 30));

        this.mediator = mediator;
    }

    public void refresh() {
        super.setText("Times clicked: " + mediator.getCounterValue());
    }

}
