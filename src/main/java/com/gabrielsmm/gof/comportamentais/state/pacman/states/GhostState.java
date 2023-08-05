package com.gabrielsmm.gof.comportamentais.state.pacman.states;

import com.gabrielsmm.gof.comportamentais.state.pacman.Ghost;

public interface GhostState {

    void spotPacman(Ghost ghost);
    void losePacman(Ghost ghost);
    void pacmanTurnsSpecial(Ghost ghost);
    void pacmanTurnsNormal(Ghost ghost);
    void eatenByPacman(Ghost ghost);
    void reachTheBase(Ghost ghost);

}
