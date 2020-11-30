package com.java8.streamapi.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnboxingIntStream {
    public static void main(String[] args) {

        //intStream to Stream<Integer>
        List<Integer> integerList = IntStream.rangeClosed(1,5)
                .boxed()
                .collect(Collectors.toList());
        integerList.forEach(System.out::println);

        //Stream<Integer> to intStream
        integerList.stream()
                .mapToInt(Integer::intValue)
                .average().ifPresent(System.out::println);

    }
}
