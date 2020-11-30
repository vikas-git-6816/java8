package com.java8.streamapi.streamoperations;

import com.java8.data.Student;
import com.java8.data.StudentRepo;

import java.util.List;
import java.util.Optional;

public class StreamReduceSumOfGpa {

    public static void main(String[] args) {
        List<Student> studentList = StudentRepo.getAllStudents();

        //with initial value
        Double sumGpa = studentList.stream()
                .map(Student::getGpa)
                .reduce(0.0,Double::sum);
                // also wroks fine
                //.reduce(0.0, (a, b) -> a + b);
        System.out.println(sumGpa);

        System.out.println("===================================================");

        //without initial Value
        Optional<Double> doubleOptional = studentList.stream()
                .map(Student::getGpa)
                .reduce(Double::sum);
        if(doubleOptional.isPresent())
            System.out.println(doubleOptional.get());

    }
}
