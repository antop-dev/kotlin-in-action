package org.antop.java.chapter2;

public class ColorMnemonic {

    public static String getMnemonic(Color color) {
        return switch (color) {
            case RED -> "Richard";
            case ORANGE -> "Of";
            case YELLOW -> "York";
            case GREEN -> "Gave";
            case BLUE -> "Battle";
            case INDIGO -> "In";
            case VIOLET -> "Vain";
        };
    }

    public static void main(String[] args) {
        System.out.println(getMnemonic(Color.BLUE)); // Battle
    }

}
