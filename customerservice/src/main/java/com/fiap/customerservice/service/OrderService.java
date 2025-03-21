
package com.fiap.customerservice.service;

import com.fiap.customerservice.model.OrderEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {
    public List<OrderEntity> getAllOrders() {
        return List.of(); // Retorno vazio temporário
    }
}
