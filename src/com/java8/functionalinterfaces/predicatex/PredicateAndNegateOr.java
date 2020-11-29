package com.java8.functionalinterfaces.predicatex;

import java.util.function.Predicate;

public class PredicateAndNegateOr {
    public static void main(String[] args) {

        //divisibleBy2and3butNot5(2);
        //divisbleby2and3ordivisbleby2and5(15);
        isLeapYear(1700);
    }

    public static void divisibleBy2and3butNot5(int number) {

        Predicate<Integer> isDivisibleBy2 = (i)->i%2==0;
        Predicate<Integer> isDivisibleBy3 = (i)->i%3==0;
        Predicate<Integer> isDivisibleBy5 = (i)->i%5==0;

        boolean result = isDivisibleBy2.and(isDivisibleBy3).and(isDivisibleBy5.negate()).test(number);
        System.out.println(result);

    }

    public static void divisbleby2and3ordivisbleby2and5(int number) {
        Predicate<Integer> isDivisibleBy2 = (i)->i%2==0;
        Predicate<Integer> isDivisibleBy3 = (i)->i%3==0;
        Predicate<Integer> isDivisibleBy5 = (i)->i%5==0;

        System.out.println(isDivisibleBy2.and(isDivisibleBy3).or(isDivisibleBy2.and(isDivisibleBy5)).test(number));
    }


    public static void isLeapYear(int year) {

        Predicate<Integer> isDivisibleBy4 = (i)->i%4==0;
        Predicate<Integer> isDivisibleBy100 = (i)->i%100==0;
        Predicate<Integer> isDivisibleBy400 = (i)->i%400==0;

        Predicate<Integer> isLeapYear = isDivisibleBy4.and(isDivisibleBy100.negate().or(isDivisibleBy400));
        System.out.println(isLeapYear.test(year));
    }


}
