package com.project.store;

public class GooglePayPaymentService implements PaymentService{
    @Override
    public void payment(double amount) {
        System.out.println("Google Pay");
        System.out.println("Amount: " + amount + " Paid");
    }
}
