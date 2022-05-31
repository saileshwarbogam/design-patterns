package com.sailesh.strategy;

public class Item {
    String itemName;
    int price;

    public Item(String itemName, int price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }



    public int getPrice() {
        return price;
    }

}
