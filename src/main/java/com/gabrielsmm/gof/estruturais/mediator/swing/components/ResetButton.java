package com.gabrielsmm.gof.estruturais.mediator.swing.components;

import com.gabrielsmm.gof.estruturais.mediator.swing.mediator.Mediator;

import javax.swing.*;

public class ResetButton extends JButton {

    public ResetButton(Mediator mediator) {
        super("Reset");

        this.addActionListener((e) -> {
            mediator.reset();
        });
    }

}
