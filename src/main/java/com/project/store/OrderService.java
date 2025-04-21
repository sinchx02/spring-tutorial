package com.project.store;

public class OrderService {


    private PaymentService paymentService;

//    public OrderService(PaymentService paymentService){ //passing the injection in contructor
//        this.paymentService=paymentService;
//    }
    public void placeOrder()
    {
        paymentService.payment(8900);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }


}
