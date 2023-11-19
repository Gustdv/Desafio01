package com.example.desafio01.services;

import org.springframework.stereotype.Service;

import com.example.desafio01.entities.Order;

@Service
public class ShippingService {
    

    //metodo de service de entrega

    public double shipment (Order order) {
        if (order.getBasic() < 100) {
            return 20.00;

        }else if (order.getBasic() >= 100 && order.getBasic() <= 200) {
            return 12.00;
        } else {
            return 0.0;
        }
    }
}
