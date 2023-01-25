package org.antop.java.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class ReadNumber {

    public static Integer readNumber(BufferedReader reader) throws IOException {
        try (reader) {
            var line = reader.readLine();
            return (line != null)
                    ? Integer.parseInt(line)
                    : null;
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new StringReader(""));
        var n = readNumber(reader);
        System.out.println("number = " + n);
    }

}
