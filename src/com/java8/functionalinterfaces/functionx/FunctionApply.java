package com.java8.functionalinterfaces.functionx;

import java.util.function.Function;

public class FunctionApply {
    public static void main(String[] args) {
        Function<String,String> upperCaseAndConcat8 = (s)->s.toUpperCase().concat("8");

        System.out.println(upperCaseAndConcat8.apply("java"));
    }
}
