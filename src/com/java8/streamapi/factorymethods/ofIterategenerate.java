package com.java8.streamapi.factorymethods;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ofIterategenerate {

    public static void main(String[] args) {

        // of - example for integers, can use String or any other object array.
        Stream<Integer> integerStream = Stream.of(1,2,3,4);
        integerStream.forEach(System.out::println);
        System.out.println("=================");

        //iterate
        Stream<Double> integerStream1 = Stream.iterate(1000.0, Math::sqrt).limit(10);
        integerStream1.forEach(System.out::println);

        System.out.println("=================");

        //generate
        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream<Integer> integerStream2 = Stream.generate(integerSupplier).limit(10);
        integerStream2.forEach(System.out::println);
    }
}
