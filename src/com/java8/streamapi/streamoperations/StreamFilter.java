package com.java8.streamapi.streamoperations;

import com.java8.data.Student;
import com.java8.data.StudentRepo;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {

        List<Student> studentList = StudentRepo.getAllStudents();

        studentList.stream()
                // commented one will work fine also
                //.filter(s->s.getGender().equals("female"))
                .filter(Student::isFemale)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
