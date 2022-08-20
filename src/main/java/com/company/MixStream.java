package com.company;

import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MixStream {
    static Stream<String> FIRST_LIST = Stream.of("I", "Java", "much", "*");
    static Stream<String> SECOND_LIST = Stream.of("love", "very", "!");

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        LinkedList<T> firstlinkedList = first.collect(Collectors.toCollection(LinkedList::new));
        LinkedList<T> secondlinkedList = second.collect(Collectors.toCollection(LinkedList::new));
        LinkedList<T> result = new LinkedList<>();
        while (!firstlinkedList.isEmpty() && !secondlinkedList.isEmpty()) {
            result.add(firstlinkedList.poll());
            result.add(secondlinkedList.poll());
        }
        return result.stream();
    }

    public static void main(String[] args) {
        System.out.println(zip(FIRST_LIST, SECOND_LIST).collect(Collectors.toList()));
    }
}
