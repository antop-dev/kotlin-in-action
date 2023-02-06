package org.antop.java.chapter3;

public class StringExtensionKt {
    public static char lastChar(String s) {
        return s.charAt(s.length() - 1);
    }

    public static char getLastChar(String s) {
        return s.charAt(s.length() - 1);

    }
    public static void main(String[] args) {
        System.out.println(StringExtensionKt.lastChar("Antop"));
    }
}
