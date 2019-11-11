package com.iquiz.fapi.service.impl;

import com.iquiz.fapi.models.Category;
import com.iquiz.fapi.service.CategoryService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class CategoryServiceImpl implements CategoryService {

    @Value("${backend.server.url}")
    private String backendServerUrl;

    @Override
    public List<Category> getAll() {
        RestTemplate restTemplate = new RestTemplate();
        Category[] categoryResponse = restTemplate.getForObject(backendServerUrl + "/api/category/", Category[].class);
        return categoryResponse == null ? Collections.emptyList() : Arrays.asList(categoryResponse);
    }

    @Override
    public Category getCategoryById(Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(backendServerUrl + "/api/category/" + id, Category.class);
    }

    @Override
    public Category saveCategory(Category category) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForEntity(backendServerUrl + "/api/category", category, Category.class).getBody();
    }

    @Override
    public void deleteCategory(Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(backendServerUrl + "/api/category/" + id);
    }
}
