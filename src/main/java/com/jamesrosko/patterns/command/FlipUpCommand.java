package com.jamesrosko.patterns.command;

public class FlipUpCommand implements ICommand {

    private Light light;

    public FlipUpCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

}
