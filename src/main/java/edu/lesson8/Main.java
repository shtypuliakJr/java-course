package edu.lesson8;

import edu.lesson8.immutable.Exam;
import edu.lesson8.student.Student;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Name_1", 20, "Group_1");
        Exam exam = new Exam(10, new Date(23132), student, "exam_name_1");

        System.out.println(student);
        System.out.println(exam);

        student.setName("Name_2");
        student.setAge(18);
        student.setGroup("Group_2");

        System.out.println(student);
        System.out.println(exam);
    }
}
