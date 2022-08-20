package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


class Names {
    private static final List<String> NAMES = Arrays.asList("Ivan", "Petro", "Oleksandr", "Vlad", "Anatoliy",
                                                       "Oleg", "Taras");

    public static void main(String[] args) {
        System.out.println(check(NAMES, i -> i % 2 != 0));
    }

    private static List<String> check(List<String> names, Predicate <Integer> checkIndex) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            if (checkIndex.test(i)) {
                result.add(i + ". " + names.get(i));
            }
        }
        return result;
    }
}
