package org.antop.java.chapter7;

import org.antop.kotlin.chapter7.Point;

public record  Circle(Point point, int radius) {
    public Circle times(int multi) {
        return new Circle(point, radius * multi);
    }
}
