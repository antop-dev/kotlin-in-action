package org.antop.java.chapter2;

import java.util.Set;

import static org.antop.java.chapter2.Color.*;

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

    public static String getWarmth(Color color) {
        return switch (color) {
            case RED, ORANGE, YELLOW -> "warm";
            case GREEN -> "neutral";
            case BLUE, INDIGO, VIOLET -> "cold";
        };
    }

    public static Color mix(Color c1, Color c2) throws Exception {
        var set = Set.of(c1, c2);
        if (set.containsAll(Set.of(RED, YELLOW))) {
            return ORANGE;
        } else if (set.containsAll(Set.of(YELLOW, BLUE))) {
            return Color.GREEN;
        } else if (set.containsAll(Set.of(BLUE, VIOLET))) {
            return Color.INDIGO;
        } else {
            throw new Exception("Dirty color");
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(Color.BLUE.rgb()); // 255
        System.out.println(getMnemonic(Color.BLUE)); // Battle
        System.out.println(mix(Color.YELLOW, Color.RED)); // ORANGE
    }

}
