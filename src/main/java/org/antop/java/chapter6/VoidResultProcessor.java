package org.antop.java.chapter6;

import org.antop.kotlin.chapter6.Processor;

public class VoidResultProcessor implements Processor<Void> {
    @Override
    public Void process() {
        return null; // 어쨋든 뭐라도 리턴해야 한다.
    }
}
