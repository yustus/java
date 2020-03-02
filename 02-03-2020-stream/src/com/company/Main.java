package com.company;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class Main {

    public static void main(String[] args) {




        List<String> list = Arrays.asList("pam", "vam", "dam", "sam");

        Stream<String> stream = filter(list);

        stream.forEach(System.out::println);

    }


    public static Stream<String> filter(Collection<String>strings){
        String str = "I was at pam pam school vam pam pam, the breakfast was pam dam ";
        return strings
                .stream()
                .filter(str::contains).sorted();
    }

}

