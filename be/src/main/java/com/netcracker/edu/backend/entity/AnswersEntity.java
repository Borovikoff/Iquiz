package com.netcracker.edu.backend.entity;

import javax.persistence.*;

@Entity
@Table(name = "answers", schema = "netcrecker", catalog = "")
public class AnswersEntity {
    private int idAnswer;
    private int idQuestion;
    private String answer;
    private byte correct;

    @Id
    @Column(name = "id_answer")
    public int getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(int idAnswer) {
        this.idAnswer = idAnswer;
    }

    @Basic
    @Column(name = "id_question")
    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    @Basic
    @Column(name = "answer")
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Basic
    @Column(name = "correct")
    public byte getCorrect() {
        return correct;
    }

    public void setCorrect(byte correct) {
        this.correct = correct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnswersEntity that = (AnswersEntity) o;

        if (idAnswer != that.idAnswer) return false;
        if (idQuestion != that.idQuestion) return false;
        if (correct != that.correct) return false;
        if (answer != null ? !answer.equals(that.answer) : that.answer != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAnswer;
        result = 31 * result + idQuestion;
        result = 31 * result + (answer != null ? answer.hashCode() : 0);
        result = 31 * result + (int) correct;
        return result;
    }
}
