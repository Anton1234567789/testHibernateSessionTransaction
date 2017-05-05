package com.sokolov.hibernate.reports;


public class ExamResult {

    private String lastname;
    private String subjectName;
    private int grade;

    @Override
    public String toString() {
        return "ExamResult{" +
                "lastname='" + lastname + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", grade=" + grade +
                '}';
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
