package com.iquiz.backend.service;

import com.iquiz.backend.entity.TestsEntity;

import java.util.Optional;

public interface TestService {
    TestsEntity saveTest(TestsEntity testEntity);

    Optional<TestsEntity> getTestById(Integer id);

    Iterable<TestsEntity> getAllTest();

    void deleteTest(Integer id);
}
