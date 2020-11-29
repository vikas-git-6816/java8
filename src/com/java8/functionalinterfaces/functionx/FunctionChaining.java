package com.java8.functionalinterfaces.functionx;

import java.util.function.Function;

public class FunctionChaining {

    public static void main(String[] args) {
        Function<String, String> upperCase = s -> s.toUpperCase();
        Function<String, String> concat8 = s -> s.concat("8");

        // chaining using andThen
        System.out.println(upperCase.andThen(concat8).apply("java"));

        // chaining using compose
        System.out.println(concat8.compose(upperCase).apply("java"));

        //Only using apply
        System.out.println(
                concat8.apply(upperCase.apply("java"))
        );


        // compose and andThen are exactly same in functionality. just order of execution are opposite to each other.
    }
}
