package com.java8.streamapi.terminaloperations;

import com.java8.data.Student;
import com.java8.data.StudentRepo;

import java.util.stream.Collectors;

public class SummingInt {

    public static void main(String[] args) {

        // summingInt, summingDouble, summingLong
        int sum = StudentRepo.getAllStudents()
                .stream()
                .map(Student::getGradeLevel)
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum);

        // averaginInt, averagingDouble, averagingLong
        double avg = StudentRepo.getAllStudents()
                .stream()
                .map(Student::getGradeLevel)
                .collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(avg);
    }
}
