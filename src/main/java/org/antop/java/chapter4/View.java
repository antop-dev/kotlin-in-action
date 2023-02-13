package org.antop.java.chapter4;

public class View {
    private final Context ctx;
    private final AttributeSet attr;

    public View(Context ctx) {
        this(ctx, null);
    }

    public View(Context ctx, AttributeSet attr) {
        this.ctx = ctx;
        this.attr = attr;
    }

}
