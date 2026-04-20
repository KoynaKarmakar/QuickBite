package com.quickbite.service;

import com.quickbite.model.FoodItem;
import com.quickbite.repository.FoodItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemService {

    private final FoodItemRepository repo;

    public FoodItemService(FoodItemRepository repo) {
        this.repo = repo;
    }

    public FoodItem save(FoodItem item) {
        return repo.save(item);
    }

    public List<FoodItem> getAll() {
        return repo.findAll();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public FoodItem getById(Long id) {
        return repo.findById(id).orElse(null);
    }
}