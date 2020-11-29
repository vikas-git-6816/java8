package com.java8.functionalinterfaces.functionx;

import java.util.function.UnaryOperator;

public class UnaryOperatorSquare {
    public static void main(String[] args) {
        UnaryOperator<Integer> calculateSquare = (i)->i*i;

        System.out.println(calculateSquare.apply(5));
    }
}
