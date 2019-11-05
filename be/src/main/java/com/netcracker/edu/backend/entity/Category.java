package com.netcracker.edu.backend.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_category;
    private String text;
    private String category;
    private String img_link;

    public Category() {
    }

    public Category(int id_category, String text, String category, String img_link) {
        this.id_category = id_category;
        this.text = text;
        this.category = category;
        this.img_link = img_link;
    }

    public int getId_category() {
        return id_category;
    }

    public void setId_category(int id_category) {
        this.id_category = id_category;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImg_link() {
        return img_link;
    }

    public void setImg_link(String img_link) {
        this.img_link = img_link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category1 = (Category) o;
        return id_category == category1.id_category &&
                Objects.equals(text, category1.text) &&
                Objects.equals(category, category1.category) &&
                Objects.equals(img_link, category1.img_link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_category, text, category, img_link);
    }

    @Override
    public String toString() {
        return "Category{" +
                "id_category=" + id_category +
                ", text='" + text + '\'' +
                ", category='" + category + '\'' +
                ", img_link='" + img_link + '\'' +
                '}';
    }
}
