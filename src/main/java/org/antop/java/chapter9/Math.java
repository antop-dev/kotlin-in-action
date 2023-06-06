package org.antop.java.chapter9;

import java.io.IOException;

public class Math {

    public static <T extends Number> double oneHalf(T value) {
        return value.doubleValue() / 2;
    }

    public static <T extends Comparable<T>> T max(T first, T second) {
        return (first.compareTo(second) > 0) ? first : second;
    }

    public static <T extends CharSequence & Appendable> void ensureTrailingPeriod(T seq) {
        if (seq == null) return;
        int length = seq.length();
        if (length > 0 && seq.charAt(length - 1) != '.') {
            try {
                seq.append('.');
            } catch (IOException e) {
                // do nothing
            }
        }
    }

    public static void main(String[] args) {
        double half = oneHalf(4L);
        System.out.println("half = " + half);

        System.out.println(max("kotlin", "java"));

        StringBuilder sb = new StringBuilder("Hello World");
        ensureTrailingPeriod(sb);
    }

}
