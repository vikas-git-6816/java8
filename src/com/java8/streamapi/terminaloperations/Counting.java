package com.java8.streamapi.terminaloperations;

import com.java8.data.Student;
import com.java8.data.StudentRepo;

import java.util.stream.Collectors;

public class Counting {
    public static void main(String[] args) {

        Long femaleStudents = StudentRepo.getAllStudents().stream()
                .filter(Student::isFemale)
                .collect(Collectors.counting());
        System.out.println(femaleStudents);

    }
}
