package com.java8.streamapi.terminaloperations;

import com.java8.data.Student;
import com.java8.data.StudentRepo;

import java.util.stream.Collectors;

public class Joining {

    public static void main(String[] args) {

        // without delimiter, prefix and suffix.
        String joinWithoutDelimiter = StudentRepo.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());
        System.out.println(joinWithoutDelimiter);

        // join with delimiter
        String joinWithDelimiter = StudentRepo.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("_"));
        System.out.println(joinWithDelimiter);

        // join with delimiter
        String joinWithDelimiterAndPrefixAndSuffix = StudentRepo.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("_","(",")"));
        System.out.println(joinWithDelimiterAndPrefixAndSuffix);
    }
}
