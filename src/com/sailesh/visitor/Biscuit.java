package com.sailesh.visitor;

public class Biscuit implements ItemElement{

    String name;
    int price;

    public Biscuit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int accept(CartVisitor visitor) {
        return visitor.visit(this);
    }
}
