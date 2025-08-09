package com.nowaitr.nowaitr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nowaitr.nowaitr.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
