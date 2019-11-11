package com.iquiz.backend.controller;

import com.iquiz.backend.service.CategoryService;
import com.iquiz.backend.entity.CategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<CategoryEntity> getCategoryById(@PathVariable(name = "id") Integer id) {
        Optional<CategoryEntity> categoryEntity = categoryService.getCategoryById(id);
        if (categoryEntity.isPresent()) {
            return ResponseEntity.ok(categoryEntity.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<CategoryEntity> getAllCategory() {
        return categoryService.getAllCategory();
    }

    @RequestMapping(method = RequestMethod.POST)
    public CategoryEntity saveCategory(@RequestBody CategoryEntity category) {
        return categoryService.saveCategory(category);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCategory(@PathVariable(name = "id") Integer id) {
        categoryService.deleteCategory(id);
    }
}
