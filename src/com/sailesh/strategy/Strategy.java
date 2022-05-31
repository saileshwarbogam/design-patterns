package com.sailesh.strategy;

public class Strategy {
    public static void main(String[] args) {
        Item item1 = new Item("Boost",100);
        Item item2 = new Item("Butter",400);

        Cart cart = new Cart();
        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new CardPayment("Sailesh","1234567891","789"));

    }
}
