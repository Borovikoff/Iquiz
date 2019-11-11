package com.iquiz.backend.service;

import com.iquiz.backend.entity.CategoryEntity;
import java.util.Optional;

public interface CategoryService {

    CategoryEntity saveCategory(CategoryEntity categoryEntity);

    Optional<CategoryEntity> getCategoryById(Integer id);

    Iterable<CategoryEntity> getAllCategory();

    void deleteCategory(Integer id);
}