package com.gabrielsmm.gof.comportamentais.state.headphone.states;

import com.gabrielsmm.gof.comportamentais.state.headphone.HeadPhone;

public class PlayingState implements HeadPhoneState {

    private static final PlayingState instance = new PlayingState();

    private PlayingState() {

    }

    @Override
    public void click(HeadPhone hp) {
        hp.setPlaying(false);
        System.out.println("> Pausing music");
        hp.setState(OnState.getInstance());
    }

    @Override
    public void longClick(HeadPhone hp) {
        hp.setPlaying(false);
        hp.setOn(false);
        System.out.println("> Turning off");
        hp.setState(OffState.getInstance());
    }

    public static PlayingState getInstance() {
        return instance;
    }

}
