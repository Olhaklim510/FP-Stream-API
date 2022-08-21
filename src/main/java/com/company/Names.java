package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Names {
    private static final List<String> NAMES = Arrays.asList("Ivan", "Petro", "Oleksandr", "Vlad", "Anatoliy",
                                                       "Oleg", "Taras");

    public static void main(String[] args) {
        String result = NAMES.stream()
                .filter(name -> NAMES.indexOf(name) % 2 != 0)
                .map(name -> NAMES.indexOf(name) + ". " + name)
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
