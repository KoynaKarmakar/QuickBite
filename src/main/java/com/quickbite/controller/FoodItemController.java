package com.quickbite.controller;

import com.quickbite.model.FoodItem;
import com.quickbite.service.FoodItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FoodItemController {

    private final FoodItemService service;

    public FoodItemController(FoodItemService service) {
        this.service = service;
    }

    @GetMapping("/menu")
    public String viewMenu(Model model) {
        model.addAttribute("items", service.getAll());
        model.addAttribute("foodItem", new FoodItem());
        return "menu";
    }

    @PostMapping("/menu")
    public String addItem(@ModelAttribute FoodItem foodItem) {
        service.save(foodItem);
        return "redirect:/menu";
    }

    @GetMapping("/menu/delete/{id}")
    public String deleteItem(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/menu";
    }
}