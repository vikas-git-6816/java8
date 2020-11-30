package com.java8.streamapi.streamoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMap {

    public static void main(String[] args) {

        List<List<String>> listOfLists = new ArrayList<>();
        listOfLists.add(Arrays.asList("Hi",",How","are"));
        listOfLists.add((Arrays.asList("you",". i","am")));
        listOfLists.add((Arrays.asList("fine","thank","you")));

        List<String> flattenList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        flattenList.forEach(System.out::println);

    }

}
