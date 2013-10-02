package com.jamesrosko.patterns.templtemethod;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TemplateMethodTest {

    @Test
    public void playGame() {
        Game game = new GameA();

        GamePlayer gamePlayer = new GamePlayer();
        gamePlayer.play(game);

        assertThat(game.score(), is(100));
    }

}
