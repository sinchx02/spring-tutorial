package com.project.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service // annotation to treat class as bean
public class OrderService {
    @Autowired //@Autowired as there are more than one constructor
    private PaymentService paymentService;

    public OrderService(){}

    public OrderService(PaymentService paymentService){ //passing the injection in contructor
        this.paymentService=paymentService;
    }
    public void placeOrder()
    {
        paymentService.payment(8900);
    }

   /* public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }*/


}
