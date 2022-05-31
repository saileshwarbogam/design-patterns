package com.sailesh.observer;

public class WhatsApp {
    public static void main(String[] args) {

        Group group = new Group();

        User user1 = new User("Saileshwar");
        User user2 = new User("Shravan");
        User user3 = new User("Mahesh");
        User user4 = new User("Naveen");
        User user5 = new User("Dhoni");

        User user6 = new User("John");

        group.addUser(user1);
        group.addUser(user2);
        group.addUser(user3);
        group.addUser(user4);
        group.addUser(user5);

        user1.addToGroup(group);
        user2.addToGroup(group);
        user3.addToGroup(group);
        user4.addToGroup(group);
        user5.addToGroup(group);

        group.sendMessage("Hello Everyone");

    }
}
