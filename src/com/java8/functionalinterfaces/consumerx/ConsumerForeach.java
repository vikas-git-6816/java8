package com.java8.functionalinterfaces.consumerx;

import com.java8.data.Student;
import com.java8.data.StudentRepo;

import java.util.List;

public class ConsumerForeach {


    public static void main(String[] args) {
        printStudents();
    }

    public static void printStudents(){
        List<Student> studentList = StudentRepo.getAllStudents();
        studentList.forEach((s)-> System.out.println(s));
    }
}
