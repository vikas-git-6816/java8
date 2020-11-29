package com.java8.data;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo {
    private final static int NO_OF_STUDENTS = 6;

    public static List<Student> getAllStudents() {
        ArrayList<Student> studentList = new ArrayList<>(NO_OF_STUDENTS);

        studentList.add(
                new Student("s1", 1, 1.5, "male")
        );

        studentList.add(
                new Student("s2", 2, 2.5, "female")
        );
        studentList.add(
                new Student("s3", 3, 3.5, "male")
        );
        studentList.add(
                new Student("s4", 4, 4.5, "female")
        );
        studentList.add(
                new Student("s5", 5, 5.5, "male")
        );
        studentList.add(
                new Student("s6", 6, 6.6, "female")
        );

        return studentList;
    }
}
