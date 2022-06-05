package com.sailesh.proxy;

public class CommandExecutorImpl implements CommandExecutor{
    @Override
    public void runCommand(String command) {
        System.out.println(command+" executed ");
    }
}
