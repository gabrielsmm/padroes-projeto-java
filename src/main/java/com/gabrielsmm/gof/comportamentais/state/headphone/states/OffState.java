package com.gabrielsmm.gof.comportamentais.state.headphone.states;

import com.gabrielsmm.gof.comportamentais.state.headphone.HeadPhone;

public class OffState implements HeadPhoneState {

    private static final OffState instance = new OffState();

    private OffState() {

    }

    @Override
    public void click(HeadPhone hp) {
        // Nothing to do
    }

    @Override
    public void longClick(HeadPhone hp) {
        hp.setOn(true);
        System.out.println("> Turning on");
        hp.setState(OnState.getInstance());
    }

    public static OffState getInstance() {
        return instance;
    }

}
