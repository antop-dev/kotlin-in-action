package org.antop.java.chapter2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

/**
 * 생일 VO
 */
public final class Birthday {
    private final LocalDate date;

    public Birthday(LocalDate date) {
        this.date = date;
    }

    public final int getAge() {
        return (int) ChronoUnit.YEARS.between(date, LocalDate.now());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Birthday birthday = (Birthday) o;
        return Objects.equals(date, birthday.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date);
    }

    public static void main(String[] args) {
        Birthday b1 = new Birthday(LocalDate.of(1983, 11, 12));
        Birthday b2 = new Birthday(LocalDate.of(1983, 11, 12));

        System.out.println("b1.age = " + b1.getAge()); // 39
        System.out.println("b2.age = " + b2.getAge()); // 39
        System.out.println(b1 == b2); // false
        System.out.println(b1.equals(b2));
    }
}
