package com.project.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {

		//SpringApplication.run(StoreApplication.class, args);
		OrderService orderService = new OrderService(new GooglePayPaymentService());
		orderService.placeOrder();
        //constructor injection --> where without changing order service both payment services can be implemented
	}

}
