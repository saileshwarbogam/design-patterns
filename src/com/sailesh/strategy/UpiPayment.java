package com.sailesh.strategy;

public class UpiPayment implements PaymentMethod{

    String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid "+amount+" with Upi");
    }
}
