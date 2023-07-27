package com.gabrielsmm.gof.comportamentais.command.alexa.alexa;

import com.gabrielsmm.gof.comportamentais.command.alexa.commands.Command;

import java.util.HashMap;
import java.util.Map;

public class Alexa {

    private Map<String, Command> integrations;
    private AlexaAI ai;

    public Alexa() {
        integrations = new HashMap<>();
        ai = new AlexaAI();
    }

    public void addIntegration(String key, Command command, String... keywords) {
        integrations.put(key, command);
        ai.addAssociation(key, keywords);
    }

    public void sendRequest(String request) {
        Command command = integrations.get(request);
        if (command == null) {
            String key = ai.getFindAssociations(request);
            command = integrations.get(key);
            if (command == null) {
                System.out.println("Sorry, I can't perform your request!");
                return;
            }
        }
        System.out.println("Send a generic command as you saved in my configurations");
        command.execute();
    }

}
