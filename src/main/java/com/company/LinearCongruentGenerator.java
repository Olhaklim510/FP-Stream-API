package com.company;

import java.util.stream.Collectors;
import java.util.stream.Stream;

class LinearCongruentGenerator {

    public static void main(String[] args) {
        Long a = 25214903917L;
        int c = 11;
        double m = Math.pow(2, 48);
        Stream<Long> result = Stream
                .iterate(0.0, seed -> 1 * (a * seed + c) % m)
                .map(Double::longValue);

        System.out.println(result
                .limit(10)
                .collect(Collectors.toList()));
    }
}
