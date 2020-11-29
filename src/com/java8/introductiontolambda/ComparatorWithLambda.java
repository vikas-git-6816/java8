package com.java8.introductiontolambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorWithLambda {
    public static void main(String[] args) {
        comparatorWithoutLambda();
        comparatorWithLambda();
    }

    public static void comparatorWithoutLambda() {

        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        };

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("zxcv");
        stringArrayList.add("vcxz");
        stringArrayList.add("adfc");
        stringArrayList.add("kghb");
        stringArrayList.add("mnkh");

        System.out.println("Before \n" + stringArrayList);
        Collections.sort(stringArrayList, c);
        System.out.println("after \n" + stringArrayList);
    }

    public static void comparatorWithLambda() {

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("zxcvL");
        stringArrayList.add("vcxzL");
        stringArrayList.add("adfcL");
        stringArrayList.add("kghbL");
        stringArrayList.add("mnkhL");

        System.out.println("Before \n" + stringArrayList);

        //correct but with return and curly braces
        // Pay attention to inner semi-colon
        // Collections.sort(stringArrayList,(String t1, String t2)-> {return t2.compareTo(t1);});

        // even need not to return , and need not to use curly braces
        //Collections.sort(stringArrayList,(String t1, String t2)-> t2.compareTo(t1));

        // Recommended
        // Works even without String(Automatically casts to string by analyzing that list is of String).
        Collections.sort(stringArrayList, (t1, t2) -> t2.compareTo(t1));


        // Example of reverseOrder
        // Collections.sort(stringArrayList, Comparator.reverseOrder());

        System.out.println("after \n" + stringArrayList);

    }


}
