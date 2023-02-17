package org.antop.java.chapter4;

public record Client(String name, int postalCode) {

    public static void main(String[] args) {
        var c1 = new Client("antop", 12345);
        var c2 = new Client("antop", 12345);
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);

        var client = new Client("antop", 157222);
        System.out.println(client);
    }
}
