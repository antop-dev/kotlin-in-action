package org.antop.java.chapter5;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Lambda {
    public void printProblemCounts(Collection<String> responses) {
        int[] errors = new int[]{0, 0};
        responses.forEach(it -> {
            if (it.startsWith("4")) {
                errors[0]++;
            } else if (it.startsWith("5")) {
                errors[1]++;
            }
        });
        System.out.println(errors[0] + " client errors, " + errors[1] + " server errors");
    }

    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        var responses = List.of("200 OK", "418 I'm a teapot", "500 Internal Server Error");
        lambda.printProblemCounts(responses);

        List.of(1, 2, 3, 4).stream()
                .map(it -> {
                    System.out.println("map(" + it + ") ");
                    return it * it;
                })
                .filter(it -> {
                    System.out.println("filter(" + it + ") ");
                    return it % 2 == 0;
                }).toList();

        Stream.of("four", "three", "two", "one");
    }
}
