package org.antop.java.chapter3;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String[] split = "12.345-6.A".split("\\.");
        System.out.println(Arrays.toString(split));
    }
}
