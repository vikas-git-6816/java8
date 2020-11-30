package com.java8.streamapi.streamoperations;

import com.java8.data.Student;
import com.java8.data.StudentRepo;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

    public static void main(String[] args) {
        List<Student> studentList = StudentRepo.getAllStudents();
        List<String> namesList = studentList.stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        namesList.forEach(System.out::println);
    }
}
