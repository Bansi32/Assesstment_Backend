package com.Project.OnlineExamination.DTO;

import jakarta.persistence.Column;
public class QuestionDTO {
    private int questionId;
    private String q1;
    private String q2;
    private String q3;
    private String q4;
    private String q5;
    private String exam;

    //constructors
    public QuestionDTO(int questionId, String q1, String q2, String q3, String q4, String q5, String exam) {
        this.questionId = questionId;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.q5 = q5;
        this.exam = exam;
    }
    public QuestionDTO(String q1, String q2, String q3, String q4, String q5, String exam) {
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.q5 = q5;
        this.exam = exam;
    }

    //getters and setters starts
    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQ1() {
        return q1;
    }

    public void setQ1(String q1) {
        this.q1 = q1;
    }

    public String getQ2() {
        return q2;
    }

    public void setQ2(String q2) {
        this.q2 = q2;
    }

    public String getQ3() {
        return q3;
    }

    public void setQ3(String q3) {
        this.q3 = q3;
    }

    public String getQ4() {
        return q4;
    }

    public void setQ4(String q4) {
        this.q4 = q4;
    }

    public String getQ5() {
        return q5;
    }

    public void setQ5(String q5) {
        this.q5 = q5;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    //getters and setter ends
    public QuestionDTO() {
    }


    @Override
    public String toString() {
        return "QuestionDTO{" +
                "questionId=" + questionId +
                ", q1='" + q1 + '\'' +
                ", q2='" + q2 + '\'' +
                ", q3='" + q3 + '\'' +
                ", q4='" + q4 + '\'' +
                ", q5='" + q5 + '\'' +
                ", exam='" + exam + '\'' +
                '}';
    }
}
