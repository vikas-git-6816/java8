package com.java8.streamapi.terminaloperations;

import com.java8.data.Student;
import com.java8.data.StudentRepo;

import java.util.Comparator;
import java.util.stream.Collectors;

public class MaxByMinBy {

    public static void main(String[] args) {

        StudentRepo.getAllStudents()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getName)))
                .ifPresent(System.out::println);

        StudentRepo.getAllStudents()
                .stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getName)))
                .ifPresent(System.out::println);
    }
}
