package com.java8.constructorandmethodreference;

import java.util.function.Function;

public class MethodReferenceFunctionUppercase {
    public static void main(String[] args) {
        Function<String, String> upperCase = String::toUpperCase;
        System.out.println(upperCase.apply("java"));
    }
}
