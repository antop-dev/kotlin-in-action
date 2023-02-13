package org.antop.kotlin.chapter4

val MY_STYLE = object : AttributeSet {}

class MyButton : View {
    constructor(ctx: Context)
            : this(ctx, MY_STYLE)

    constructor(ctx: Context, attr: AttributeSet?)
            : super(ctx, attr)
}
