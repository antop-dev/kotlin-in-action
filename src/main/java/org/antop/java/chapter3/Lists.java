package org.antop.java.chapter3;

public class Lists {
    public static void makeOf(Object... values) {
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};
        makeOf(array);
    }
}
