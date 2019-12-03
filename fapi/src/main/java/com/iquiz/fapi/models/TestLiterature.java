package com.iquiz.fapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class TestLiterature {
    private int idTest;
    private int idLiterature;
    private String testName;
    private String link;

    public TestLiterature() {
    }

    public TestLiterature(int idTest, int idLiterature, String testName, String link) {
        this.idTest = idTest;
        this.idLiterature = idLiterature;
        this.testName = testName;
        this.link = link;
    }

    public int getIdTest() {
        return idTest;
    }

    public void setIdTest(int idTest) {
        this.idTest = idTest;
    }

    public int getIdLiterature() {
        return idLiterature;
    }

    public void setIdLiterature(int idLiterature) {
        this.idLiterature = idLiterature;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
