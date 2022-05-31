package com.sailesh.observer;

import java.util.ArrayList;
import java.util.List;

public class Group implements Subject {
    private List<User> users = new ArrayList<>();
    public  String message;

    @Override
    public void addUser(User user){
        users.add(user);

    }
    @Override
    public void leaveGroup(User user){
        users.remove(user);
    }

    @Override
    public void notifyUsers() {
        for(User user: users){
            user.update();
        }
    }

    @Override
    public void sendMessage(String message){
        this.message = message;
        notifyUsers();
    }
}
