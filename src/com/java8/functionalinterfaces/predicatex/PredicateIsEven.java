package com.java8.functionalinterfaces.predicatex;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateIsEven {

    public static void main(String[] args) {
        isEvenMethod();
    }

    public static void isEvenMethod() {
        Predicate<Integer> isEven = (i)->i%2==0;
        System.out.println(isEven.test(6));

        // works fine too
        //Predicate<Integer> isEven = (i)->i%2==0;
        //Consumer<Boolean> print = (b)-> System.out.println(b);
        //print.accept(isEven.test(4));
    }
}
