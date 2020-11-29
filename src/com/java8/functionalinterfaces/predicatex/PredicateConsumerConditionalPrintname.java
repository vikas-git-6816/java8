package com.java8.functionalinterfaces.predicatex;

import com.java8.data.Student;
import com.java8.data.StudentRepo;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateConsumerConditionalPrintname {
    public static void main(String[] args) {

        Predicate<Student> gpaGreaterThan3 = (s)->s.getGpa()>3.0;
        Consumer<Student> printName = (s)-> System.out.println(s.getName());


        List<Student> studentList = StudentRepo.getAllStudents();
        studentList.forEach( s -> {
                    if (gpaGreaterThan3.test(s))
                        printName.accept(s);
                }
        );
    }
}
