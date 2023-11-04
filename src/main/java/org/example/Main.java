package org.example;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello git!!!");
        System.out.println("Hello git!!!");
        System.out.println("Hello git!!!");
        System.out.println("Hello git!!!");
        System.out.println("Hello git!!!");
        System.out.println("Hello git!!!");
        IntStream.range(0, 10).mapToObj(i -> "Om!!!").forEach(System.out::println);
    }
}