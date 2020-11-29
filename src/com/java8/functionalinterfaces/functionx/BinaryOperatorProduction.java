package com.java8.functionalinterfaces.functionx;

import java.util.function.BinaryOperator;

public class BinaryOperatorProduction {
    public static void main(String[] args) {
        BinaryOperator<Integer> calculateProduct = (a,b)->a*b;

        System.out.println(calculateProduct.apply(5,6));
    }
}
