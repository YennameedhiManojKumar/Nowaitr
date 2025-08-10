package com.nowaitr.nowaitr.service;

import org.springframework.stereotype.Service;
import com.nowaitr.nowaitr.model.Order;
import com.nowaitr.nowaitr.repository.OrderRepository;
import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        orderRepository.deleteById(id);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

}
