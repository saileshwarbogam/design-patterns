package com.sailesh.observer;

public class User implements Observer {
    private String name;
    private Group group = new Group();

    @Override
    public void update() {
        System.out.println(this.name
                +" Message received! "+ group.message);
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public void addToGroup(Group group){
        this.group = group;
    }
}
