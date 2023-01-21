package org.antop.java.chapter2;

public class Rectangle {
    private final int height;
    private final int weight;

    public Rectangle(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isSquare() {
        return height == weight;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(200, 200);
        r.isSquare(); // true
    }

}
