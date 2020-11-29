package com.java8.functionalinterfaces.functionx;

import java.util.function.BiFunction;

public class BiFunctionSum {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> sumF = (a,b)-> a+b;

        System.out.println(sumF.apply(5,6));
    }
}
