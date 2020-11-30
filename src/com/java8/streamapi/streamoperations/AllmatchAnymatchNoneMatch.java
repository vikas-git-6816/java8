package com.java8.streamapi.streamoperations;

import com.java8.data.Student;
import com.java8.data.StudentRepo;

import java.util.List;

public class AllmatchAnymatchNoneMatch {
    public static void main(String[] args) {
        List<Student> studentList = StudentRepo.getAllStudents();


        boolean isAllGpalessThan10 = studentList.stream()
                .allMatch(s -> s.getGpa()<=10.0);
        System.out.println(isAllGpalessThan10);

        boolean isAnyGpaGreaterThan5 = studentList.stream()
                .anyMatch(s -> s.getGpa()>5.0);
        System.out.println(isAnyGpaGreaterThan5);

        boolean isNoneGpaGreaterThan10 = studentList.stream()
                .noneMatch(s -> s.getGpa()>=10.0);
        System.out.println(isNoneGpaGreaterThan10);

    }
}
