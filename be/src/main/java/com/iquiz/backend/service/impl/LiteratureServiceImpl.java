package com.iquiz.backend.service.impl;

import com.iquiz.backend.entity.LiteratureEntity;
import com.iquiz.backend.repository.LiteratureRepository;
import com.iquiz.backend.service.LiteratureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class LiteratureServiceImpl implements LiteratureService {

    private LiteratureRepository repository;

    @Autowired
    public LiteratureServiceImpl(LiteratureRepository repository) {
        this.repository = repository;
    }

    @Override
    public LiteratureEntity saveLiterature(LiteratureEntity literatureEntity) {
        return repository.save(literatureEntity);
    }

    @Override
    public Optional<LiteratureEntity> getLiteratureById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Iterable<LiteratureEntity> getAllLiterature() {
        return repository.findAll();
    }

    @Override
    public void deleteLiterature(Integer id) {
        repository.deleteById(id);
    }
}
