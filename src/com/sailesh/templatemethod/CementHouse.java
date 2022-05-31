package com.sailesh.templatemethod;

public class CementHouse extends HouseTemplate{
    @Override
    public void buildPillars() {
        System.out.println("Building pillars with cement");
    }

    @Override
    public void buildWalls() {
        System.out.println("Building walls with cement");
    }
}
