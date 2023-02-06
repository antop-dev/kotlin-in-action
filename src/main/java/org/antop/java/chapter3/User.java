package org.antop.java.chapter3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public class User {
    private final int id;
    private final String name;
    private final String address;

    public User(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void saveUser(final User user) {
        var validate = new Function2<Object, Object, Unit>() {
            @Override
            public Unit invoke(Object var1, Object var2) {
                invoke((String) var1, (String) var2);
                return Unit.INSTANCE;
            }

            private void invoke(String value, String fieldName) {
                throw new IllegalArgumentException("Can't save user " + user.getId() + ": empty " + fieldName);
            }
        };

        validate.invoke(user.getName(), "Name");
        validate.invoke(user.getAddress(), "Address");
    }
}
