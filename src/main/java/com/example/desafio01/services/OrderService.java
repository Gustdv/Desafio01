package com.example.desafio01.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.desafio01.entities.Order;

@Service
public class OrderService {
    
   //Injecao de dependecia

   @Autowired
    private ShippingService shippingService;


    //metodo total
    public double total(Order order) {
        double discount = order.getBasic() * (order.getDiscount() / 100);
        return (order.getBasic() - discount) + shippingService.shipment(order);
    }
}
