package com.netcracker.edu.backend.entity;

import javax.persistence.*;

@Entity
@Table(name = "questions", schema = "netcrecker", catalog = "")
public class QuestionsEntity {
    private int idQuestion;
    private int idTest;
    private String question;

    @Id
    @Column(name = "id_question")
    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    @Basic
    @Column(name = "id_test")
    public int getIdTest() {
        return idTest;
    }

    public void setIdTest(int idTest) {
        this.idTest = idTest;
    }

    @Basic
    @Column(name = "question")
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuestionsEntity that = (QuestionsEntity) o;

        if (idQuestion != that.idQuestion) return false;
        if (idTest != that.idTest) return false;
        if (question != null ? !question.equals(that.question) : that.question != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idQuestion;
        result = 31 * result + idTest;
        result = 31 * result + (question != null ? question.hashCode() : 0);
        return result;
    }
}
