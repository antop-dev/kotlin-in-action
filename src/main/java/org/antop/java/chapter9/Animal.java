package org.antop.java.chapter9;

public class Animal {
    public void feed() {
        System.out.println("eating...");
    }

    public static void feedAll(Herd<Animal> animals) {
        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).feed();
        }
    }
}
