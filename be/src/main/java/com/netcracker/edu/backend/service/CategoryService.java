package com.netcracker.edu.backend.service;

import com.netcracker.edu.backend.entity.Category;

import java.util.Optional;

public interface CategoryService {

    Category saveCategory(Category category);
    Optional<Category> getCategoryById(Integer id);
    Iterable<Category> getAllCategories();
    void deleteCategory(Integer id);
}