package org.antop.java.chapter5;

import org.antop.kotlin.chapter5.Book;

import java.util.List;
import java.util.stream.Collectors;

public class BookLambda {
    public static void main(String[] args) {
        var books = List.of(
                new Book("Thursday Next", List.of("Jasper Fforde")),
                new Book("Mort", List.of("Terry Pratcheet")),
                new Book("Good Omens", List.of("Terry Pratcheet", "Neil Gaiman"))
        );
        var authors = books.stream()
                .flatMap(it -> it.getAuthors().stream())
                .collect(Collectors.toSet());
        System.out.println(authors);
        // [Neil Gaiman, Terry Pratcheet, Jasper Fforde]
    }
}
