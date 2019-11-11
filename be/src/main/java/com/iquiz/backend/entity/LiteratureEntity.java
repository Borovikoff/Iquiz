package com.iquiz.backend.entity;

import javax.persistence.*;

@Entity
@Table(name = "literature", schema = "netcrecker")
public class LiteratureEntity {
    private int idLiterature;
    private String link;

    @Id
    @Column(name = "id_literature")
    public int getIdLiterature() {
        return idLiterature;
    }

    public void setIdLiterature(int idLiterature) {
        this.idLiterature = idLiterature;
    }

    @Basic
    @Column(name = "link")
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LiteratureEntity that = (LiteratureEntity) o;

        if (idLiterature != that.idLiterature) return false;
        if (link != null ? !link.equals(that.link) : that.link != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idLiterature;
        result = 31 * result + (link != null ? link.hashCode() : 0);
        return result;
    }
}
