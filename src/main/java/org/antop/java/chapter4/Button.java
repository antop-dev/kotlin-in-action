package org.antop.java.chapter4;

public final class Button implements Clickable, Focusable {
    @Override
    public void click() {
        System.out.println("I was clicked");
    }

    @Override
    public void showOff() {
        Clickable.super.showOff();
        Focusable.super.showOff();
    }

    public static void main(String[] args) {
        Button button = new Button();
        button.click();
        button.showOff();
    }
}
