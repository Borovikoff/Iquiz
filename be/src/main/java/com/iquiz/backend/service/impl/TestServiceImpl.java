package com.iquiz.backend.service.impl;

import com.iquiz.backend.entity.TestsEntity;
import com.iquiz.backend.repository.TestRepository;
import com.iquiz.backend.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TestServiceImpl implements TestService {
    private TestRepository repository;

    @Autowired
    public TestServiceImpl(TestRepository repository) {
        this.repository = repository;
    }

    @Override
    public TestsEntity saveTest(TestsEntity testEntity) {
        return repository.save(testEntity);
    }

    @Override
    public Optional<TestsEntity> getTestById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Iterable<TestsEntity> getAllTest() {
        return repository.findAll();
    }

    @Override
    public void deleteTest(Integer id) {
        repository.deleteById(id);
    }
}
