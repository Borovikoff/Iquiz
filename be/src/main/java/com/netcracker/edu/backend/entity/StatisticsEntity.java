package com.netcracker.edu.backend.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "statistics", schema = "netcrecker", catalog = "")
public class StatisticsEntity {
    private int idStatistics;
    private int idUser;
    private double statistics;
    private Date dateAnswer;
    private int idTest;

    @Id
    @Column(name = "id_statistics")
    public int getIdStatistics() {
        return idStatistics;
    }

    public void setIdStatistics(int idStatistics) {
        this.idStatistics = idStatistics;
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
    @Column(name = "statistics")
    public double getStatistics() {
        return statistics;
    }

    public void setStatistics(double statistics) {
        this.statistics = statistics;
    }

    @Basic
    @Column(name = "date_answer")
    public Date getDateAnswer() {
        return dateAnswer;
    }

    public void setDateAnswer(Date dateAnswer) {
        this.dateAnswer = dateAnswer;
    }

    @Basic
    @Column(name = "id_test")
    public int getIdTest() {
        return idTest;
    }

    public void setIdTest(int idTest) {
        this.idTest = idTest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StatisticsEntity that = (StatisticsEntity) o;

        if (idStatistics != that.idStatistics) return false;
        if (idUser != that.idUser) return false;
        if (Double.compare(that.statistics, statistics) != 0) return false;
        if (idTest != that.idTest) return false;
        if (dateAnswer != null ? !dateAnswer.equals(that.dateAnswer) : that.dateAnswer != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idStatistics;
        result = 31 * result + idUser;
        temp = Double.doubleToLongBits(statistics);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (dateAnswer != null ? dateAnswer.hashCode() : 0);
        result = 31 * result + idTest;
        return result;
    }
}
