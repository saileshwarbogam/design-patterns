package com.sailesh.mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        User user1 = new User("Sailesh"); //user objects uses chatroom method to share msgs
        User user2 = new User("Mahesh");
        user2.sendMessage("Hello"); //users can send msg to the chatroom and chatroom shows msgs to all
        user1.sendMessage("World!");
    }
}
