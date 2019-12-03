package com.iquiz.fapi.service.impl;

import com.iquiz.fapi.models.Literature;
import com.iquiz.fapi.service.LiteratureService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LiteratureServiceImpl implements LiteratureService {
    @Value("${backend.server.url}")
    private String backendServerUrl;


    @Override
    public List<Literature> getAll() {
        RestTemplate restTemplate = new RestTemplate();
        Literature[] literatureResponse = restTemplate.getForObject(backendServerUrl + "/api/literature/", Literature[].class);
        return literatureResponse == null ? Collections.emptyList() : Arrays.asList(literatureResponse);
    }

    @Override
    public Literature getLiteratureById(Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(backendServerUrl + "/api/literature/" + id, Literature.class);
    }

    @Override
    public Literature saveLiterature(Literature literature) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForEntity(backendServerUrl + "/api/literature", literature, Literature.class).getBody();
    }

    @Override
    public void deleteLiterature(Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(backendServerUrl + "/api/literature" + id);
    }
}
