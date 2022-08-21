package com.company;

import java.util.*;
import java.util.stream.Collectors;

class Numbers {
    private static final List<String> STRING_NUMBERS = Arrays.asList("1,2,0", "4,5");

    public static void main(String[] args) {
        String result= STRING_NUMBERS.stream()
                .map(s -> s.split(","))
                .flatMap(Arrays::stream)
                .map(Integer::valueOf)
                .sorted()
                .map(num->String.valueOf(num))
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
