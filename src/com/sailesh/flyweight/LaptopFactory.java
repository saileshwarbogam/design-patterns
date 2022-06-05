package com.sailesh.flyweight;

import java.util.HashMap;

public class LaptopFactory {

    private static HashMap<String, Laptop> map = new HashMap<>();

    public static Laptop getLaptop(String type) {
        Laptop laptop=null;

        if(map.containsKey(type)){
            laptop = map.get(type);
            System.out.println(type+" model exists assigning new UUID");
        }

        else {
            switch (type) {
                case "HP" :
                    System.out.println("HP laptop created.");
                    laptop = new HP();
                    break;
                case "DELL" :
                    System.out.println("DELL laptop created");
                    laptop = new DELL();
                    break;
                default:
                    System.out.println("Something went wrong");
            }
            map.put(type,laptop);
        }

        return laptop;
    }

}
