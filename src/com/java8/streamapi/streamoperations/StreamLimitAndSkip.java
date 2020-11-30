package com.java8.streamapi.streamoperations;

import java.util.Arrays;
import java.util.List;

public class StreamLimitAndSkip {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5);

        // limit(2) - read only 2 elements from start
        integers.stream()
                .limit(2)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

        //skip(2) - skip 2 elements from start and read remaining
        integers.stream()
                .skip(2)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
    }
}
