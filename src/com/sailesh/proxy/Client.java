package com.sailesh.proxy;

public class Client {
    public static void main(String[] args) {

        CommandExecutorProxy commandExecutorProxy = new CommandExecutorProxy("Sailesh","abc");
        commandExecutorProxy.runCommand("rm text.txt");

        CommandExecutorProxy commandExecutorProxy2 = new CommandExecutorProxy("Sailesh","abcd");
        commandExecutorProxy2.runCommand("rm text.txt");
        commandExecutorProxy2.runCommand("ls Desktop");
    }
}
