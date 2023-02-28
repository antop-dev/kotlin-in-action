package org.antop.java.chapter5;

public class Button {
    public void setOnClickListener(OnClickListener listener) {

    }

    public static void main(String[] args) {
        Button button = new Button();
        button.setOnClickListener(view -> { /* code */ });
    }

}
