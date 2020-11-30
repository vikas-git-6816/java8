package com.java8.streamapi.streamoperations;

import com.java8.data.Student;
import com.java8.data.StudentRepo;

import java.util.List;
import java.util.Optional;

public class StudentReducemaxGpa {

    public static void main(String[] args) {
        List<Student> studentList = StudentRepo.getAllStudents();

        Optional<Student> optionalStudent = studentList.stream()
                .reduce((s1,s2)->{
                    if(s1.getGpa()>=s2.getGpa())
                        return s1;
                    return s2;
                });

        if(optionalStudent.isPresent())
            System.out.println(optionalStudent.get());
    }
}
