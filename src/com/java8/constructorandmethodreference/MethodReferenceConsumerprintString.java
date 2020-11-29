package com.java8.constructorandmethodreference;

import java.util.function.Consumer;

public class MethodReferenceConsumerprintString {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;

        print.accept("java");
    }
}
