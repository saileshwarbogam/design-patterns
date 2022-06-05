package com.sailesh.flyweight;

import java.util.Random;
import java.util.UUID;

public class FlyweightClient {

    private static String[] laptopType = {"HP","DELL"};

    public static String generateUUID() {
        UUID uuid = UUID.randomUUID();

        return uuid.toString();
    }

    public  static String getLaptopType() {
        Random random = new Random();

        int i = random.nextInt(laptopType.length);

        return laptopType[i];
    }

    public static void main(String[] args) {

        for(int i=0; i<5 ; i++){
            Laptop laptop = LaptopFactory.getLaptop(getLaptopType());

            laptop.assignUUID(generateUUID());

            laptop.details();

            System.out.println();
        }

    }
}
