package org.antop.java.chapter4;

public class User {
    private final String nickname;
    private final boolean subscribed;
    private String address = "unspecified";

    public User(String nickname) {
        this(nickname, false);
    }

    public User(String nickname, boolean subscribed) {
        this.nickname = nickname;
        this.subscribed = subscribed;
    }

    public String getNickname() {
        return nickname;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        System.out.println("Address was changed for " + nickname + ":\n" +
                "\"" + this.address + "\" -> \"" + address + "\"");
        this.address = address;
    }

    public static void main(String[] args) {
        var antop = new User("안탑");
        System.out.println(antop.getNickname() + " -> " + antop.isSubscribed());

        var jack = new User("Jack", false);
        System.out.println(jack.getNickname() + " -> " + jack.isSubscribed());

        var user = new User("Kent");
        user.setAddress("Elsenheimerstrasse 47, 80687 Muechen");
    }

}
