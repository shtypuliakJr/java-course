package edu.lesson8.student;

import java.util.Date;

/**
 * @author Arthur Shtypuliak
 * @since 12.07.2021
 * @see Student
 * @see Exam
 */
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
