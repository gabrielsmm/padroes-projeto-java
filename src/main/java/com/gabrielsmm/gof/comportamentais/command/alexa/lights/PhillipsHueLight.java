package com.gabrielsmm.gof.comportamentais.command.alexa.lights;

public class PhillipsHueLight implements GenericLight {

    @Override
    public void turnOn() {
        System.out.println("The PhillipsHueLight is On!");
    }

    @Override
    public void turnOff() {
        System.out.println("The PhillipsHueLight is Off!");
    }

}
