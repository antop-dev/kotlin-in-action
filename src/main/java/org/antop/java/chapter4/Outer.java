package org.antop.java.chapter4;

public class Outer {
    class Inner {
        public Outer getOuterReference() {
            return Outer.this;
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        System.out.println(inner.getOuterReference());
    }
}
