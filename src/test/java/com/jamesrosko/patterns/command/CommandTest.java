package com.jamesrosko.patterns.command;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class CommandTest {

    private Light lamp;
    private LightSwitch lightSwitch;

    @Before
    public void setup() {
        lamp = new Light();
        lightSwitch = new LightSwitch();
    }

    @Test
    public void switchUp() {
        ICommand switchUp = new FlipUpCommand(lamp);

        // act
        lightSwitch.storeAndExecute(switchUp);

        assertThat(lightSwitch.getLastExecutedCommand(), is(switchUp));
    }

    @Test
    public void switchDown() {
        ICommand switchDown = new FlipDownCommand(lamp);

        // act
        lightSwitch.storeAndExecute(switchDown);

        assertThat(lightSwitch.getLastExecutedCommand(), is(switchDown));
    }

    @Test
    public void both() {
        ICommand switchUp = new FlipUpCommand(lamp);
        ICommand switchDown = new FlipDownCommand(lamp);

        // act
        lightSwitch.storeAndExecute(switchUp);
        assertThat(lightSwitch.getLastExecutedCommand(), is(switchUp));
        lightSwitch.storeAndExecute(switchDown);
        assertThat(lightSwitch.getLastExecutedCommand(), is(switchDown));
        lightSwitch.storeAndExecute(switchUp);
        assertThat(lightSwitch.getLastExecutedCommand(), is(switchUp));
    }
}
