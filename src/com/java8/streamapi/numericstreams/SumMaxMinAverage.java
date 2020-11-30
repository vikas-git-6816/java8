package com.java8.streamapi.numericstreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class SumMaxMinAverage {

    public static void main(String[] args) {

        System.out.println("IntStream");
        //sum()
        int intSum = IntStream.rangeClosed(1,5).sum();
        System.out.println(intSum);

        //max()
        IntStream.rangeClosed(1,5).max().ifPresent(System.out::println);

        //min()
        IntStream.rangeClosed(1,5).min().ifPresent(System.out::println);

        //average
        IntStream.rangeClosed(1,5).average().ifPresent(System.out::println);

        System.out.println("LongStream");
        //sum()
        long longSum = LongStream.rangeClosed(1,5).sum();
        System.out.println(longSum);

        //max()
        LongStream.rangeClosed(1,5).max().ifPresent(System.out::println);

        //min()
        LongStream.rangeClosed(1,5).min().ifPresent(System.out::println);

        //average
        LongStream.rangeClosed(1,5).average().ifPresent(System.out::println);

        System.out.println("DoubleStream");

        //sum()
        Double doubleSum = IntStream.rangeClosed(1,5).asDoubleStream().sum();
        System.out.println(doubleSum);

        //max()
        IntStream.rangeClosed(1,5).asDoubleStream().max().ifPresent(System.out::println);

        //min()
        IntStream.rangeClosed(1,5).asDoubleStream().min().ifPresent(System.out::println);

        //average
        IntStream.rangeClosed(1,5).asDoubleStream().average().ifPresent(System.out::println);


    }
}
