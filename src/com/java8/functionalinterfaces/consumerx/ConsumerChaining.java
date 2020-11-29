package com.java8.functionalinterfaces.consumerx;

import com.java8.data.Student;
import com.java8.data.StudentRepo;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerChaining {
    static Consumer<Student> printName = (s)-> System.out.print(s.getName()+" ");
    static Consumer<Student> printGender = (s) -> System.out.println(s.getGender());

    public static void main(String[] args) {
        //printNameAndGender();
        printNameAndGenderConditional();
    }

    public static void printNameAndGender() {
        List<Student> studentList = StudentRepo.getAllStudents();
        studentList.forEach(printName.andThen(printGender));
    }

    public static void printNameAndGenderConditional() {
        List<Student> studentList = StudentRepo.getAllStudents();
        //without accept, code compiles but print nothing
        //Consumer<Student> gpaGreaterThan3 = (s)->{ if(s.getGpa()>3.0) printName.andThen(printGender).accept(s);};
        //studentList.forEach(gpaGreaterThan3);

        //without accept, code compiles but print nothing
        studentList.forEach(
                (s)-> {
                    if(s.getGpa()>3.0)
                        printName.andThen(printGender).accept(s);
                }
        );
    }
}
