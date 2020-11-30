package com.java8.streamapi.streamoperations;

import com.java8.data.Student;
import com.java8.data.StudentRepo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinctCountSorted {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("vikas","anand","dev","anand");

        //print distinct names
        names.stream()
                .distinct()
                .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("=================================");

        // print 4 - number of elements
        Long count = names.stream()
                .count();
        System.out.println(count);

        System.out.println("=================================");
        // sort elements
        names.stream()
                .sorted()
                .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("=================================");

        // sort by name ascending
        List<Student> studentList = StudentRepo.getAllStudents();
        studentList.stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("=================================");

        //sort by name descending
        studentList.stream()
                .sorted(Comparator.comparing(Student::getName).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);



    }
}
