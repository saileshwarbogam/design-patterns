package com.sailesh.templatemethod;

public abstract class HouseTemplate {
    public final void buildHouse() {
        buildBasement();
        buildPillars();
        buildWalls();
        buildWindows();
        buildComplete();
    }

    public  void buildBasement(){
        System.out.println("Building basement with cement, sand and rocks");
    }

    public  void buildWindows(){
        System.out.println("Building windows with glass");
    }

    public void buildComplete() {
        System.out.println("House build complete");
    }

    public abstract void buildPillars();
    public abstract void buildWalls();
}
