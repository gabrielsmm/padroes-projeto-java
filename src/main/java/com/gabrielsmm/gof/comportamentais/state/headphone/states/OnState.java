package com.gabrielsmm.gof.comportamentais.state.headphone.states;

import com.gabrielsmm.gof.comportamentais.state.headphone.HeadPhone;

public class OnState implements HeadPhoneState {

    private static final OnState instance = new OnState();

    private OnState()  {

    }

    @Override
    public void click(HeadPhone hp) {
        hp.setPlaying(true);
        System.out.println("> Playing music");
        hp.setState(PlayingState.getInstance());
    }

    @Override
    public void longClick(HeadPhone hp) {
        hp.setOn(false);
        System.out.println("> Turning off");
        hp.setState(OffState.getInstance());
    }

    public static OnState getInstance() {
        return instance;
    }

}
