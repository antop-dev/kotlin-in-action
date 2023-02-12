package org.antop.java.chapter4;

public interface Clickable {
    void click();
    default void showOff() {
        System.out.println("I'm clickable!");
    }
}
