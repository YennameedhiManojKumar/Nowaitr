package com.nowaitr.nowaitr.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.nowaitr.nowaitr.model.OrderItem;
import com.nowaitr.nowaitr.repository.OrderItemRepository;

@Service
public class OrderItemService {

    private OrderItemRepository orderItemRepository;

    public OrderItemService(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    public OrderItem saveOrderItem(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    public List<OrderItem> getAllOrderItems() {
        return orderItemRepository.findAll();
    }

    public OrderItem getById(Long id) {
        return orderItemRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        orderItemRepository.deleteById(id);
    }
}
