package com.iquiz.fapi.service;

import com.iquiz.fapi.models.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();

    Category getCategoryById(Integer id);

    Category saveCategory(Category category);

    void deleteCategory(Integer id);
}
