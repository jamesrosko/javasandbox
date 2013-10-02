package com.jamesrosko.patterns.templtemethod;

public class GamePlayer {

    public void play(Game game) {
        game.setup();
        game.movePlayer();
        game.endGame();
    }

}
