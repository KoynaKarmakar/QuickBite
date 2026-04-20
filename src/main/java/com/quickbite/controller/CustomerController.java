package com.quickbite.controller;

import com.quickbite.model.Customer;
import com.quickbite.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping("/customers")
    public String viewCustomers(Model model) {
        model.addAttribute("customers", service.getAll());
        model.addAttribute("customer", new Customer());
        return "customers";
    }

    @PostMapping("/customers")
    public String addCustomer(@ModelAttribute Customer customer) {
        service.save(customer);
        return "redirect:/customers";
    }

    @GetMapping("/customers/delete/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/customers";
    }
}