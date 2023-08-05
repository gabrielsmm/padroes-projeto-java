package com.gabrielsmm.gof.comportamentais.state.pacman;

import com.gabrielsmm.gof.comportamentais.state.pacman.states.GhostState;
import com.gabrielsmm.gof.comportamentais.state.pacman.states.WanderMazeState;

public class Ghost {

    private GhostState state = WanderMazeState.getInstance();

    public Ghost() {

    }

    public void spotPacman() {
        state.spotPacman(this);
    }

    public void losePacman() {
        state.losePacman(this);
    }

    public void pacmanTurnsSpecial() {
        state.pacmanTurnsSpecial(this);
    }

    public void pacmanTurnsNormal() {
        state.pacmanTurnsNormal(this);
    }

    public void eatenByPacman() {
        state.eatenByPacman(this);
    }

    public void reachTheBase() {
        state.reachTheBase(this);
    }

    public GhostState getState() {
        return state;
    }

    public void setState(GhostState state) {
        this.state = state;
    }
}
