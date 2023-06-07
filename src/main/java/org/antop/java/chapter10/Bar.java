package org.antop.java.chapter10;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Bar {

    public void foo(int x) {
        System.out.println(x);
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Bar bar = new Bar();
        Class<? extends Bar> clazz = bar.getClass();
        Method method = clazz.getDeclaredMethod("foo", int.class);
        method.invoke(bar, 42);
    }

}
