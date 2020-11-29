package com.java8.functionalinterfaces.consumerx;

import java.util.function.Consumer;

public class ConsumerUpperCase {
    public static void main(String[] args) {
        Consumer<String> c = (s)-> System.out.println(s.toUpperCase());
        c.accept("java8");
    }
}
