package com.example.desafio01;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.desafio01.entities.Order;
import com.example.desafio01.services.OrderService;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

   //Injecao de dependencia
   @Autowired
   private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}


	
	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);

		Order order =  new Order(1034,150.00,20.0);
		System.out.println("Order code : " + order.getCode());
		System.out.printf("Total value: %.2f%n ", orderService.total(order) );
	}
}
