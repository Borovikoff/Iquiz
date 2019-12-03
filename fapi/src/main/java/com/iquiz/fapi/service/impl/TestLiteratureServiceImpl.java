package com.iquiz.fapi.service.impl;

import com.iquiz.fapi.models.TestLiterature;
import com.iquiz.fapi.service.TestLiteratureService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class TestLiteratureServiceImpl implements TestLiteratureService {
    @Value("${backend.server.url}")
    private String backendServerUrl;


    @Override
    public List<TestLiterature> getTestLiterature() {
        RestTemplate restTemplate = new RestTemplate();
        TestLiterature[] testLiteraturesResponse = restTemplate.getForObject(backendServerUrl + "/api/testLiterature", TestLiterature[].class);
        return testLiteraturesResponse == null ? Collections.emptyList() : Arrays.asList(testLiteraturesResponse);
    }
}
