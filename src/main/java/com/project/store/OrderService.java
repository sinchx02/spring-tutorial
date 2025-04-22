package com.project.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service // annotation to treat class as bean
public class OrderService {
    private PaymentService paymentService;

    // does not require @Autowired as there is single constructor used
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
