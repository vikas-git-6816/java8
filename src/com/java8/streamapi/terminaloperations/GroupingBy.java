package com.java8.streamapi.terminaloperations;

import com.java8.data.Student;
import com.java8.data.StudentRepo;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {

    public static void main(String[] args) {

        System.out.println("============== Group By Gender================");
        //group by gender
        Map<String, List<Student>> groupByGender = StudentRepo.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));
        groupByGender.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

        System.out.println("===============Group By Performance===============");
        // groupby average and outstanding
        Map<String, List<Student>> groupByPerformance = StudentRepo.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(s -> s.getGpa() >= 3.5 ? "OUTSTANDING" : "AVERAGE"));
        groupByPerformance.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));


        System.out.println("===============find gradelevel sum - genderwise===============");
        // groupBy and find avg gpa
        Map<String, Integer> genderwiseGradeSum = StudentRepo.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.summingInt(Student::getGradeLevel)));

        System.out.println(genderwiseGradeSum);


    }
}
