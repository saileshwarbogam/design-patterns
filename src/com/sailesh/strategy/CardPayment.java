package com.sailesh.strategy;

public class CardPayment implements PaymentMethod{

    String cardName;

    String cardNumber;
    String cardCVV;

    public CardPayment(String cardName, String cardNumber,String cardCVV) {
        this.cardName = cardName;
        this.cardCVV = cardCVV;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid "+amount+" with card");
    }
}
