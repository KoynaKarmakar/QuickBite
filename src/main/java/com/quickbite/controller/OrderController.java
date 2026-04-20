package com.quickbite.controller;

import com.quickbite.model.OrderEntity;
import com.quickbite.model.Customer;
import com.quickbite.model.FoodItem;
import com.quickbite.service.OrderService;
import com.quickbite.service.CustomerService;
import com.quickbite.service.FoodItemService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class OrderController {

    private final OrderService orderService;
    private final CustomerService customerService;
    private final FoodItemService foodItemService;

    public OrderController(OrderService orderService,
                           CustomerService customerService,
                           FoodItemService foodItemService) {
        this.orderService = orderService;
        this.customerService = customerService;
        this.foodItemService = foodItemService;
    }

    @GetMapping("/orders")
    public String viewOrders(Model model) {
        model.addAttribute("orders", orderService.getAll());
        model.addAttribute("order", new OrderEntity());
        model.addAttribute("customers", customerService.getAll());
        model.addAttribute("items", foodItemService.getAll());
        return "orders";
    }

    @PostMapping("/orders")
    public String addOrder(@RequestParam Long customerId,
                           @RequestParam Long foodItemId,
                           @RequestParam int quantity) {

        Customer customer = customerService.getById(customerId);
        FoodItem foodItem = foodItemService.getById(foodItemId);

        OrderEntity order = new OrderEntity();
        order.setCustomer(customer);
        order.setFoodItem(foodItem);
        order.setQuantity(quantity);

        orderService.save(order);

        return "redirect:/orders";
    }

    @GetMapping("/orders/delete/{id}")
    public String deleteOrder(@PathVariable Long id) {
        orderService.delete(id);
        return "redirect:/orders";
    }
}