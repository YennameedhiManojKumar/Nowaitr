package com.nowaitr.nowaitr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nowaitr.nowaitr.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
