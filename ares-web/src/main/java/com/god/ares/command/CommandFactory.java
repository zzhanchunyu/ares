package com.god.ares.command;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {

    private Map<CommandType, Command> commandMap = new HashMap<>();

    public void setCommandMap(Map<CommandType, Command> commandMap) {
        this.commandMap = commandMap;
    }

    public Command getCommand(CommandType cmdType) {
        if (commandMap.containsKey(cmdType)) {
            return commandMap.get(cmdType);
        }
        return null;
    }
}
