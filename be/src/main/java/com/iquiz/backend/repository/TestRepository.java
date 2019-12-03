package com.iquiz.backend.repository;

import com.iquiz.backend.entity.TestsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends CrudRepository<TestsEntity, Integer> {
}
