package org.antop.java.chapter9;


import java.util.List;

public class Cat extends Animal {
    public void cleanLitter() {
    }

    public static void main(String[] args) {
        Herd<Cat> herd = new Herd<>(List.of(new Cat(), new Cat()));
//        Animal.feedAll(herd);
        // incompatible types: org.antop.java.chapter9.Herd<org.antop.java.chapter9.Cat> cannot be converted to org.antop.java.chapter9.Herd<org.antop.java.chapter9.Animal>
    }
}
