package com.java8.functionalinterfaces.consumerx;

import java.util.function.BiConsumer;

public class BiConsumerProductAndDivision {
    public static void main(String[] args) {
        printProductAndDivison();
    }

    public static void printProductAndDivison() {
        // Though we took both objects of same type, it is not mandatory.
        // two objects can be of different types.
        BiConsumer<Integer, Integer> product = (i1,i2)-> System.out.println("product " + i1*i2);
        BiConsumer<Integer, Integer> division = (i1,i2)-> System.out.println("division "+ i1/i2);

        product.andThen(division).accept(8,2);
    }


}
