package com.iquiz.backend.service;

import com.iquiz.backend.entity.LiteratureEntity;

import java.util.Optional;

public interface LiteratureService {
    LiteratureEntity saveLiterature(LiteratureEntity literatureEntity);

    Optional<LiteratureEntity> getLiteratureById(Integer id);

    Iterable<LiteratureEntity> getAllLiterature();

    void deleteLiterature(Integer id);
}
