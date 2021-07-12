package edu.lesson8;

import java.time.LocalDate;
import java.util.Date;

public final class Exam {
    private final int examClassNumber;
    private final Date date;
    private final Student student;
    private final String examName;

    public Exam(int examClassNumber, Date date, Student student, String examName) {
        this.examClassNumber = examClassNumber;
        this.date = date;
        this.student = (Student) student.clone();
        this.examName = examName;
    }

    public int getExamClassNumber() {
        return examClassNumber;
    }
    public Student getStudent() {
        return (Student) student.clone();
    }
    public Date getDate() {
        return (Date) date.clone();
    }
    public String getExamName() {
        return examName;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examClassNumber=" + examClassNumber +
                ", date=" + date +
                ", student=" + student +
                ", examName='" + examName + '\'' +
                '}';
    }
}


