package com.jamesrosko.patterns.command;

public class FlipDownCommand implements ICommand {

    private Light light;

    public FlipDownCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }

}
