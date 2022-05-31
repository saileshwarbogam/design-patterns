package com.sailesh.bridge;

public class Car extends AutoMobile{
    public Car(WorkShop produce, WorkShop assemble) {
        super(produce, assemble);
    }

    @Override
    public void manufacture() {
        System.out.print("Car's ");
        produce.work();
        assemble.work();
    }
}
