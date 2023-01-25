package org.antop.java.chapter2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class BinaryReps {

    public static void main(String[] args) {
        var binaryReps = new TreeMap<Character, String>();
        for (char c = 'A'; c <= 'F'; c++) {
            var binary = Integer.toBinaryString(c);
            binaryReps.put(c, binary);
        }
        for (Map.Entry<Character, String> e : binaryReps.entrySet()) {
            var letter = e.getKey();
            var binary = e.getValue();
            System.out.println(letter + " = " + binary);

            var number = 10;
            var percentage = number;
            if (percentage < 0 && percentage > 100) {
                throw new IllegalArgumentException("" + number);
            }
        }
    }

}
