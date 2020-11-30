package com.java8.streamapi.streamoperations;

import java.util.Arrays;
import java.util.List;

public class findAnyfindFirst {

    public static void main(String[] args) {

        // findANy, findFirst -  results same element in sequential stream
        // findANy, findFirst -  amy give different results in case of paralleStream

        List<Integer> integerList = Arrays.asList(1,2,3,4,5);

        integerList.stream()
                .filter( i -> i>4)
                .findAny()
                .ifPresent(System.out::println);

        integerList.stream()
                .filter(i->i>4)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
