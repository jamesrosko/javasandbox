package com.jamesrosko.patterns.templtemethod;

import org.apache.log4j.Logger;

public class GameA implements Game {

    private static Logger log = Logger.getLogger(GameA.class);

    int score = 0;

    public Integer score() {
        return score;
    }

    public void setup() {
        log.info("setup");
        score = 0;
    }

    public void movePlayer() {
        log.info("move player");
        score = 50;
    }

    public void endGame() {
        log.info("endGame");
        score = score * 2;
    }

}
