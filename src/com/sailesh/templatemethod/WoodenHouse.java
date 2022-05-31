package com.sailesh.templatemethod;

public class WoodenHouse extends HouseTemplate {

    @Override
    public void buildPillars() {
        System.out.println("Building pillars with wood");
    }

    @Override
    public void buildWalls() {
        System.out.println("Building walls with wood");
    }
}
