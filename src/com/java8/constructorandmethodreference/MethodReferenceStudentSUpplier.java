package com.java8.constructorandmethodreference;

import com.java8.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceStudentSUpplier {

    public static void main(String[] args) {
        Supplier<Student> studentSupplier = Student::new;
        System.out.println(studentSupplier.get());


        Function<String,Student> studentFunctionSupplier = Student::new;
        System.out.println(studentFunctionSupplier.apply("vikas"));
    }
}
