package com.sailesh.flyweight;

public class DELL implements Laptop {

    String uuid;
    String name;

    public DELL() {
        this.name = "DELL";
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
