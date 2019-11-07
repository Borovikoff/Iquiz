package com.netcracker.edu.backend.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "tests", schema = "netcrecker", catalog = "")
public class TestsEntity {
    private int idTest;
    private Integer idLiterature;
    private int idCategory;
    private int idUser;
    private String testName;
    private Date dateCreate;

    @Id
    @Column(name = "id_test")
    public int getIdTest() {
        return idTest;
    }

    public void setIdTest(int idTest) {
        this.idTest = idTest;
    }

    @Basic
    @Column(name = "id_literature")
    public Integer getIdLiterature() {
        return idLiterature;
    }

    public void setIdLiterature(Integer idLiterature) {
        this.idLiterature = idLiterature;
    }

    @Basic
    @Column(name = "id_category")
    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    @Basic
    @Column(name = "id_user")
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "test_name")
    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    @Basic
    @Column(name = "date_create")
    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestsEntity that = (TestsEntity) o;

        if (idTest != that.idTest) return false;
        if (idCategory != that.idCategory) return false;
        if (idUser != that.idUser) return false;
        if (idLiterature != null ? !idLiterature.equals(that.idLiterature) : that.idLiterature != null) return false;
        if (testName != null ? !testName.equals(that.testName) : that.testName != null) return false;
        if (dateCreate != null ? !dateCreate.equals(that.dateCreate) : that.dateCreate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTest;
        result = 31 * result + (idLiterature != null ? idLiterature.hashCode() : 0);
        result = 31 * result + idCategory;
        result = 31 * result + idUser;
        result = 31 * result + (testName != null ? testName.hashCode() : 0);
        result = 31 * result + (dateCreate != null ? dateCreate.hashCode() : 0);
        return result;
    }
}
