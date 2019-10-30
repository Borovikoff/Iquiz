package com.netcracker.edu.fapi.service;

import com.netcracker.edu.fapi.models.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();
    Category getCategoryById(Long id);
    Category saveCategory(Category category);
    void deleteCategory(Long id);
}
