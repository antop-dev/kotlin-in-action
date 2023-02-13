package org.antop.java.chapter4;

public class LengthCounter {
    private int counter = 0;

    public void addWord(String word) {
        counter += word.length();
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        LengthCounter lengthCounter = new LengthCounter();
        lengthCounter.addWord("hello");
        lengthCounter.addWord("antop");
        System.out.println(lengthCounter.getCounter());
    }
}
