package com.gabrielsmm.gof.comportamentais.command.alexa.lights;

public class XiaomiLight implements GenericLight {

    @Override
    public void turnOn() {
        System.out.println("The XiaomiLight is On!");
    }

    @Override
    public void turnOff() {
        System.out.println("The XiaomiLight is Off!");
    }

}
