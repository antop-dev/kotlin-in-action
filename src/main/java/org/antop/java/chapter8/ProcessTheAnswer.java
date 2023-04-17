package org.antop.java.chapter8;

import kotlin.jvm.functions.Function1;

public class ProcessTheAnswer {

    public static void processTheAnswer(kotlin.jvm.functions.Function1<Integer, Integer> f) {
        System.out.println(f.invoke(42));
    }

    public static void main(String[] args) {
        processTheAnswer(number -> number + 1);

        processTheAnswer(new Function1<Integer, Integer>() {
            @Override
            public Integer invoke(Integer integer) {
                return integer + integer;
            }
        });
    }
}
