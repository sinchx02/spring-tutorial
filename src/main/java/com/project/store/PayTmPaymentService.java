package com.project.store;

import org.springframework.stereotype.Service;

@Service
public class PayTmPaymentService implements PaymentService
{
    public void payment(double amount) {
        System.out.println("Pay Tm");
        System.out.println("Amount: " + amount + " Paid");
    }
    }

