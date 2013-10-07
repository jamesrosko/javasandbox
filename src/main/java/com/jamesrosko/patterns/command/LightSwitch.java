package com.jamesrosko.patterns.command;

import java.util.ArrayList;
import java.util.List;

public class LightSwitch {
    private List<ICommand> commands = new ArrayList<ICommand>();

    public void storeAndExecute(ICommand command) {
        commands.add(command);
        command.execute();
    }

    public ICommand getLastExecutedCommand() {
        return commands.get(commands.size()-1);
    }
}
