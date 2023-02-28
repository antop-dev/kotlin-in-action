package org.antop.java.chapter5;

import org.antop.kotlin.chapter5.Person;

import java.util.List;
import java.util.stream.Collectors;

public class GroupBy {
    public static void main(String[] args) {
        var people = List.of(
                new Person("Alice", 31),
                new Person("Bob", 29),
                new Person("Carol", 31)
        );
        var map = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));
        System.out.println(map);

        var counter = people.stream()
                .collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));
        System.out.println(counter);
    }
}
