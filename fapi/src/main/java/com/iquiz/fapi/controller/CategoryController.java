package com.iquiz.fapi.controller;

import com.iquiz.fapi.models.Category;
import com.iquiz.fapi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {


    @Autowired
    private CategoryService categoryService;

    @RequestMapping
    public ResponseEntity<List<Category>> getAllCategory() {
        return ResponseEntity.ok(categoryService.getAll());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Category> saveCategory(@RequestBody Category category /*todo server validation*/) {
        if (category != null) {
            return ResponseEntity.ok(categoryService.saveCategory(category));
        }
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCategory(@PathVariable String id) {
        categoryService.deleteCategory(Integer.valueOf(id));
    }

    @RequestMapping(value = "/{id}")
    public ResponseEntity<Category> getAllCategory(@PathVariable String id) throws InterruptedException {
        int categoryId = Integer.valueOf(id);
        return ResponseEntity.ok(categoryService.getCategoryById(categoryId));
    }
}
