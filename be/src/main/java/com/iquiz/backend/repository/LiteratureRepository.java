package com.iquiz.backend.repository;

import com.iquiz.backend.entity.LiteratureEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiteratureRepository extends CrudRepository<LiteratureEntity, Integer> {
}
