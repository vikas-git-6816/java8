package com.java8.functionalinterfaces.supplierx;

import com.java8.data.Student;
import com.java8.data.StudentRepo;

import java.util.List;
import java.util.function.Supplier;

public class SuppliergetStudent {
    public static void main(String[] args) {
        Supplier<List<Student>> sttudentSupplier = ()-> StudentRepo.getAllStudents();
        System.out.println(sttudentSupplier.get());

    }
}
