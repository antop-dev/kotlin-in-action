package org.antop.java.chapter9;

import java.util.List;

public class Herd<T extends Animal> {
    private final List<T> animals;

    public Herd(List<T> animals) {
        this.animals = animals;
    }

    public int size() {
        return animals.size();
    }

    public T get(int i) {
        return animals.get(i);
    }

}
