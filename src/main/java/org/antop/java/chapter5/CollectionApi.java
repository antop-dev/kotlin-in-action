package org.antop.java.chapter5;

import org.antop.kotlin.chapter5.Person;

import java.util.List;
import java.util.function.Predicate;

public class CollectionApi {

    public static void main(String[] args) {
        var list = List.of(1, 2, 3, 4);
        var filtered = list.stream()
                .filter(it -> it % 2 == 0)
                .toList();
        System.out.println(filtered);

        var mapped = list.stream()
                .map(it -> it * it)
                .toList();
        System.out.println(mapped);

        List<Person> people = List.of(
                new Person("Alice", 27),
                new Person("Bob", 31)
        );

        Predicate<Person> canBeInClub27 = it -> it.getAge() <= 27;
        System.out.println(people.stream().allMatch(canBeInClub27)); // false
        System.out.println(people.stream().anyMatch(canBeInClub27)); // true
        System.out.println(people.stream().filter(canBeInClub27).count()); // 1
        System.out.println(people.stream().findFirst());
    }
}
