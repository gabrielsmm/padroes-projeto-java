package com.gabrielsmm.gof.estruturais.mediator.swing.components;

import com.gabrielsmm.gof.estruturais.mediator.swing.mediator.Mediator;

import javax.swing.*;

public class AddButton extends JButton {

    public AddButton(Mediator mediator) {
        super("Click me!");

        this.addActionListener((e) -> {
            mediator.buttonClicked();
        });
    }

}
