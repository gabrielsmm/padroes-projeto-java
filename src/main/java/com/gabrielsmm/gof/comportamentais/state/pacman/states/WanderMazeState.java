package com.gabrielsmm.gof.comportamentais.state.pacman.states;

import com.gabrielsmm.gof.comportamentais.state.pacman.Ghost;

public class WanderMazeState implements GhostState {

    private static final GhostState instance = new WanderMazeState();

    private WanderMazeState() {

    }

    @Override
    public void spotPacman(Ghost ghost) {
        System.out.println("I've just spot the pacman, let's chase him!");
        ghost.setState(ChasePacmanState.getInstance());
    }

    @Override
    public void losePacman(Ghost ghost) {
        System.out.println("How to lose what I haven't found?");
    }

    @Override
    public void pacmanTurnsSpecial(Ghost ghost) {
        System.out.println("Oh no! We have a Super Pacman now, better hide!");
        ghost.setState(FleePacmanState.getInstance());
    }

    @Override
    public void pacmanTurnsNormal(Ghost ghost) {
        System.out.println("But he was normal already...");
    }

    @Override
    public void eatenByPacman(Ghost ghost) {
        System.out.println("Are you joking? It's impossible to be eaten by a normal Pacman...");
    }

    @Override
    public void reachTheBase(Ghost ghost) {
        System.out.println("I wasn't going to the base...");
    }

    public static GhostState getInstance() {
        return instance;
    }

}
