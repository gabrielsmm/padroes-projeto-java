package com.gabrielsmm.gof.estruturais.mediator.translate;

import com.gabrielsmm.gof.estruturais.mediator.translate.mediator.Mediator;
import com.gabrielsmm.gof.estruturais.mediator.translate.mediator.TranslatorMediator;
import com.gabrielsmm.gof.estruturais.mediator.translate.model.EnglishUser;
import com.gabrielsmm.gof.estruturais.mediator.translate.model.PortugueseUser;
import com.gabrielsmm.gof.estruturais.mediator.translate.model.User;

public class Client {

    public static void main(String[] args) {
        // Mediator chatRoom = new ChatMediator();
        Mediator chatRoom = new TranslatorMediator();

        User alan = new EnglishUser("Alan", chatRoom);
        User jose = new PortugueseUser("Jose", chatRoom);
        User sue = new EnglishUser("Sue", chatRoom);
        User maria = new PortugueseUser("Maria", chatRoom);

        chatRoom.addUser(alan);
        chatRoom.addUser(sue);
        chatRoom.addUser(maria);

        alan.sendMessage("Hello");
        maria.sendMessage("Oi", alan);

        chatRoom.removeUser(sue);

        alan.sendMessage("How are you?", maria);
        maria.sendMessage("Estou bem, obrigado.", alan);

        chatRoom.addUser(jose);

        jose.sendMessage("Oi");

        chatRoom.removeUser(maria);
    }

}
