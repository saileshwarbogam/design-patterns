package com.sailesh.templatemethod;

public class TemplateMethod {
    public static void main(String[] args) {
        HouseTemplate cementHouse = new CementHouse();
        cementHouse.buildHouse();
        System.out.println();
        System.out.println();
        HouseTemplate woodenHouse = new WoodenHouse();
        woodenHouse.buildHouse();

    }
}
