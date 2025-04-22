package com.project.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {

		// run method returns an object of application context
		//AC is IOC container -->storage for objects
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		OrderService orderService =context.getBean(OrderService.class);
		orderService.placeOrder();




		/*OrderService orderService = new OrderService();
		orderService.setPaymentService(new GooglePayPaymentService());
		orderService.placeOrder();*/
        //setter injection --> where without changing order service both payment services can be implemented
		// This type of injection is only used for optional dependency as it throws null pointer exception if setPaymentService is not called
		//in this case setter injection is not recommended as paymentService is required and not optional
	}

}
