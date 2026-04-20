package com.quickbite.service;

import com.quickbite.model.OrderEntity;
import com.quickbite.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository repo;

    public OrderService(OrderRepository repo) {
        this.repo = repo;
    }

    public OrderEntity save(OrderEntity order) {

        double price = order.getFoodItem().getPrice();
        int qty = order.getQuantity();

        order.setTotalPrice(price * qty);

        return repo.save(order);
    }

    public List<OrderEntity> getAll() {
        return repo.findAll();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}