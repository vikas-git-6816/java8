package com.java8.streamapi.numericstreams;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RangeAndRangeClosed {
    public static void main(String[] args) {

        System.out.println("=============== IntStream ==========");

        // of() array
        System.out.print("\nIntStream of() ");
        IntStream.of(1,2,3)
                .forEach(System.out::print);

        // iterate via seed and unary operator
        System.out.print("\nIntStream iterate() ");
        IntStream.iterate(1,i->i*2).limit(3)
                .forEach(System.out::print);

        // generate via supplier
        System.out.print("\nIntStream generate() ");
        IntStream.generate(new Random()::nextInt).limit(3)
                .forEach(System.out::print);

        // range - doesnot include last element
        System.out.print("\nIntStream range() ");
        IntStream.range(1,3)
                .forEach(System.out::print);

        //rangeClosed - include last element
        System.out.print("\nIntStream rangeClosed() ");
        IntStream.rangeClosed(1,3)
                .forEach(System.out::print);



        System.out.println("\n =============== LongStream ==========");
        // of() array
        System.out.print("LongStream of() ");
        LongStream.of(1,2,3)
                .forEach(System.out::print);

        // iterate via seed and unary operator
        System.out.print("\nLongStream iterate() ");;
        LongStream.iterate(1,i->i*2).limit(3)
                .forEach(System.out::print);

        // generate via supplier
        System.out.print("\nLongStream generate() ");
        LongStream.generate(new Random()::nextInt).limit(3)
                .forEach(System.out::print);

        // range - doesnot include last element
        System.out.print("\nLongStream range() ");
        LongStream.range(1,3)
                .forEach(System.out::print);

        //rangeClosed - include last element
        System.out.print("\nLongStream rangedClosed() ");
        LongStream.rangeClosed(1,3)
                .forEach(System.out::print);


        System.out.println("\n =============== DoubleStream ==========");
        // of() array
        System.out.print("DoubleStream of() ");
        DoubleStream.of(1,2,3)
                .forEach(System.out::print);

        // iterate via seed and unary operator
        System.out.print("\nDoubleStream iterate() ");
        DoubleStream.iterate(1,i->i*2).limit(3)
                .forEach(System.out::print);


        // generate via supplier
        System.out.print("\nDoubleStream generate() ");
        DoubleStream.generate(new Random()::nextDouble).limit(3)
                .forEach(System.out::print);

        //double Stream doesnt support range and rangeClosed. if needed use asDoubleStream in IntStream
        System.out.println("\n\nDoubleStream doesnt support range and rangeClosed. if needed use asDoubleStream() available in IntStream as shown below\n");

        //range as doubleStream
        System.out.print("IntStream.range().asDoubleStream() ");
        IntStream.range(1,3).asDoubleStream()
                .forEach(System.out::print);

        // rangeCLosed as doubleStream
        System.out.print("\nIntStream.rangeClosed().asDoubleStream() ");
        IntStream.rangeClosed(1,3).asDoubleStream()
                .forEach(System.out::print);



    }
}
