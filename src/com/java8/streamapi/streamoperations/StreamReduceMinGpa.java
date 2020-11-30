package com.java8.streamapi.streamoperations;

import com.java8.data.Student;
import com.java8.data.StudentRepo;

import java.util.List;
import java.util.Optional;

public class StreamReduceMinGpa {

    public static void main(String[] args) {
        List<Student> studentList = StudentRepo.getAllStudents();

        Optional<Double> minGpa = studentList.stream()
                .map(Student::getGpa)
                .reduce(Double::min);

        minGpa.ifPresent(System.out::println);
    }
}
