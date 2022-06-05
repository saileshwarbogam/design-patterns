package com.sailesh.flyweight;

public class HP implements  Laptop{

    String name;
    String uuid;

    public HP() {
        this.name = "HP";
    }

    @Override
    public void assignUUID(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public void details() {
        System.out.println(name +" : "+uuid);
    }
}
