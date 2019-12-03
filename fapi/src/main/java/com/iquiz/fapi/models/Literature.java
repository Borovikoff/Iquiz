package com.iquiz.fapi.models;

public class Literature {
    private int idLiterature;
    private String link;

    public Literature() {
    }

    public Literature(int idLiterature, String link) {
        this.idLiterature = idLiterature;
        this.link = link;
    }

    public int getIdLiterature() {
        return idLiterature;
    }

    public void setIdLiterature(int idLiterature) {
        this.idLiterature = idLiterature;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }


}
