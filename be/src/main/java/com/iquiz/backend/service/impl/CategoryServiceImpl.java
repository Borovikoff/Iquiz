package com.iquiz.backend.service.impl;

import com.iquiz.backend.entity.CategoryEntity;
import com.iquiz.backend.service.CategoryService;
import com.iquiz.backend.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository repository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public CategoryEntity saveCategory(CategoryEntity categoryEntity) {
        return repository.save(categoryEntity);
    }

    @Override
    public Optional<CategoryEntity> getCategoryById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Iterable<CategoryEntity> getAllCategory() {
        return repository.findAll();
    }

    @Override
    public void deleteCategory(Integer id) {
        repository.deleteById(id);
    }
}
