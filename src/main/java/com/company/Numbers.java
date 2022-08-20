package com.company;

import java.util.*;

class Numbers {
    private static final List<String> STRING_NUMBERS = Arrays.asList("1,2,0", "4,5");

    public static void main(String[] args) {
        List<Integer> result= STRING_NUMBERS.stream()
                .map(s -> s.split(","))
                .flatMap(Arrays::stream)
                .map(Integer::valueOf)
                .sorted()
                .toList();
        System.out.println(result);
    }
}
