package org.antop.java.chapter1;

import java.util.Arrays;
import java.util.Collections;

public class Function {
    public static void main(String[] args) {
        var nums = Arrays.asList(3, 4, 5, 2, 1);
        System.out.println("nums   = " + nums);
        Collections.sort(nums, (o1, o2) -> o2 - o1);
        System.out.println("sorted = " + nums);
    }
}
