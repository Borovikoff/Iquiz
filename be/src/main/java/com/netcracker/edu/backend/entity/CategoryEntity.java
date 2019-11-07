package com.netcracker.edu.backend.entity;

import javax.persistence.*;

@Entity
@Table(name = "category", schema = "netcrecker", catalog = "")
public class CategoryEntity {
    private int idCategory;
    private String text;
    private String category;
    private String imgLink;

    @Id
    @Column(name = "id_category")
    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    @Basic
    @Column(name = "text")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Basic
    @Column(name = "category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "img_link")
    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoryEntity that = (CategoryEntity) o;

        if (idCategory != that.idCategory) return false;
        if (text != null ? !text.equals(that.text) : that.text != null) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (imgLink != null ? !imgLink.equals(that.imgLink) : that.imgLink != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCategory;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (imgLink != null ? imgLink.hashCode() : 0);
        return result;
    }
}
