package com.sailesh.strategy;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<Item> items;

    public Cart() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public int calculateAmount() {
        int amount=0;
        for(Item item : items){
            amount+=item.price;
        }
        return amount;
    }
    public void pay(PaymentMethod paymentMethod){
        int amount = calculateAmount();
        paymentMethod.pay(amount);
    }
}
