package org.antop.java.chapter5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NotLambda {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        Collections.sort(words, Comparator.comparingInt(o -> o.charAt(1)));
    }
}
