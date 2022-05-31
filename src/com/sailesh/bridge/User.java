package com.sailesh.bridge;

public class User {
    public static void main(String[] args) {
        AutoMobile car = new Car(new Produce(),new Assemble());

        car.manufacture();
    }
}
