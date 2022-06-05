package com.sailesh.proxy;

public class CommandExecutorProxy implements CommandExecutor{

    private CommandExecutor executor;

    private  boolean isAdmin;

    public CommandExecutorProxy(String username, String password){
        if(username.equals("Sailesh") && password.equals("abc")) {
            isAdmin = true;
        }
        executor = new CommandExecutorImpl();

    }

    @Override
    public void runCommand(String command) {
        if(isAdmin){
            executor.runCommand(command);
        }
        else{
            if(command.startsWith("rm")){
                System.out.println("remove is not allowed by non admin users");
            }
            else{
                executor.runCommand(command);
            }
        }

    }
}
