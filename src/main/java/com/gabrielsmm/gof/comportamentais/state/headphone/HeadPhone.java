package com.gabrielsmm.gof.comportamentais.state.headphone;

import com.gabrielsmm.gof.comportamentais.state.headphone.states.HeadPhoneState;
import com.gabrielsmm.gof.comportamentais.state.headphone.states.OffState;

public class HeadPhone {

    private boolean isOn;
    private boolean isPlaying;
    private HeadPhoneState state;

    public HeadPhone() {
        this.isOn = false;
        this.isPlaying = false;
        this.state = OffState.getInstance();
    }

    public void onClick() {
        System.out.println("Click pressed...");
        state.click(this);
    }

    public void onLongClick() {
        System.out.println("Long click pressed...");
        state.longClick(this);
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    public HeadPhoneState getState() {
        return state;
    }

    public void setState(HeadPhoneState state) {
        this.state = state;
    }

}
