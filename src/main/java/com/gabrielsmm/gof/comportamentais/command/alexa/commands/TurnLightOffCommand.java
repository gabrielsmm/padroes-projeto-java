package com.gabrielsmm.gof.comportamentais.command.alexa.commands;

import com.gabrielsmm.gof.comportamentais.command.alexa.lights.GenericLight;

public class TurnLightOffCommand implements Command {

    private GenericLight light;

    public TurnLightOffCommand(GenericLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

}
