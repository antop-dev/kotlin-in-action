package org.antop.java.chapter3;

public class StringBuilderExtension {
    public static char getLastChar(StringBuilder sb) {
        return sb.charAt(sb.length() - 1);
    }

    public static void setLastChar(StringBuilder sb, char ch) {
        sb.setCharAt(sb.length() - 1, ch);
    }

    public static void main(String[] args) {
        var sb = new StringBuilder("Antop!");
        System.out.println(sb); // Antop!
        setLastChar(sb, '?');
        System.out.println(sb); // Antop?

    }

}
