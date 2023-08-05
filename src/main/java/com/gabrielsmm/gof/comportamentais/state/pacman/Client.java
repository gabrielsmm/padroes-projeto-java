package com.gabrielsmm.gof.comportamentais.state.pacman;

import com.gabrielsmm.gof.comportamentais.state.pacman.game.Game;

import java.io.IOException;

public class Client {

    public static void main(String[] args) throws IOException {
        Ghost ghost = new Ghost();
        Game game = new Game();

        game.addListener(option -> {
            switch (option) {
                case "1" -> ghost.spotPacman();
                case "2" -> ghost.losePacman();
                case "3" -> ghost.pacmanTurnsSpecial();
                case "4" -> ghost.pacmanTurnsNormal();
                case "5" -> ghost.eatenByPacman();
                case "6" -> ghost.reachTheBase();
                case "0" -> game.stopLoop();
                default -> System.out.println("Invalid option!");
            }
        });

        game.startLoop();
    }

}
