package com.sailesh.observer;

public interface Subject {
    void addUser(User user);

    void leaveGroup(User user);

    void notifyUsers();

    void sendMessage(String message);
}
