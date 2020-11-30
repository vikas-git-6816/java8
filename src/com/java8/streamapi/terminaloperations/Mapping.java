package com.java8.streamapi.terminaloperations;

import com.java8.data.Student;
import com.java8.data.StudentRepo;

import java.util.List;
import java.util.stream.Collectors;

public class Mapping {

    public static void main(String[] args) {

        List<String> names = StudentRepo.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName,Collectors.toList()));

        names.forEach(System.out::println);
    }
}
