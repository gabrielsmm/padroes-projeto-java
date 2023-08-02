package com.gabrielsmm.gof.estruturais.mediator.swing.mediator;

import com.gabrielsmm.gof.estruturais.mediator.swing.components.AddButton;
import com.gabrielsmm.gof.estruturais.mediator.swing.components.Label;
import com.gabrielsmm.gof.estruturais.mediator.swing.components.State;

public class Mediator {

    private AddButton button;
    private Label label;
    private State state;

    public void buttonClicked() {
        state.addCount();
        label.refresh();
    }

    public void stop() {
        button.setEnabled(false);
    }

    public void reset() {
        state.setCounter(0);
        button.setEnabled(true);
        label.refresh();
    }

    public int getCounterValue() {
        return state.getCounter();
    }

    public void setButton(AddButton button) {
        this.button = button;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public void setState(State state) {
        this.state = state;
    }

}
