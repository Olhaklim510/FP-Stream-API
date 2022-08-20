package com.company;

import java.util.*;
import java.util.stream.Collectors;

class NamesSorted {
    private static final List<String> NAMES = Arrays.asList("Ivan", "Petro", "Oleksandr", "Vlad", "Anatoliy",
            "Oleg", "Taras");

    public static void main(String[] args) {
        List<String> newName = NAMES.stream()
                .map(String::toUpperCase)
                .sorted((o1, o2) -> o2.charAt(0) - o1.charAt(0))
                .collect(Collectors.toList());
        System.out.println(newName);
    }
}
