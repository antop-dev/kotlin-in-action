package org.antop.java.chapter3;

import java.util.Collection;
import java.util.List;

public class Join {
    private static final String DEFAULT_SEPARATOR = ", ";
    private static final String DEFAULT_PREFIX = "(";
    private static final String DEFAULT_POSTFIX = ")";

    public static <T> String joinToString(Collection<T> collection) {
        return joinToString(collection, DEFAULT_SEPARATOR);
    }

    public static <T> String joinToString(
            Collection<T> collection,
            String separator
    ) {
        return joinToString(collection, separator, DEFAULT_PREFIX);
    }

    public static <T> String joinToString(
            Collection<T> collection,
            String separator,
            String prefix
    ) {
        return joinToString(collection, separator, prefix, DEFAULT_POSTFIX);
    }

    public static <T> String joinToString(
            Collection<T> collection,
            String separator,
            String prefix,
            String postfix
    ) {
        var sb = new StringBuilder(prefix);
        var i = 0;
        for (T e : collection) {
            if (i++ > 0) sb.append(separator);
            sb.append(e);
        }
        sb.append(postfix);
        return sb.toString();
    }

    public static void main(String[] args) {
        var list = List.of(1, 2, 3);
        var join = joinToString(list);
        System.out.println(join);
    }
}
