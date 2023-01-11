package org.antop.java.chapter1;

import java.util.List;
import java.util.NoSuchElementException;

public class Person {
    private final String name;
    private final Integer age;

    public Person(String name) {
        this(name, null);
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person(" +
                "name=" + name +
                ", age=" + age +
                ')';
    }

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("영희"),
                new Person("철수", 29),
                new Person("안탑", 39)
        );

        Person oldest = persons.stream()
                .max((a, b) -> {
                    int age1 = (a.getAge() != null) ? a.getAge() : 0;
                    int age2 = (b.getAge() != null) ? b.getAge() : 0;
                    return age1 - age2;
                })
                .orElseThrow(NoSuchElementException::new);

        System.out.println("나이가 가장 많은 사람: " + oldest);
    }

}
