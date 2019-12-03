package com.iquiz.fapi.service;

import com.iquiz.fapi.models.Literature;

import java.util.List;

public interface LiteratureService {
    List<Literature> getAll();

    Literature getLiteratureById(Integer id);

    Literature saveLiterature(Literature literature);

    void deleteLiterature(Integer id);
}