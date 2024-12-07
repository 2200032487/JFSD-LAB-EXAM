package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Order;
import com.klef.jfsd.exam.respository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public void addOrder(Order order) {
        orderRepository.save(order);
    }
}
