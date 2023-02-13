package org.antop.kotlin.chapter4

interface Context

interface AttributeSet

open class View {
    val ctx: Context
    var attr: AttributeSet? = null
        private set

    constructor(ctx: Context) : this(ctx, null)

    constructor(ctx: Context, attr: AttributeSet?) {
        this.ctx = ctx
        this.attr = attr
    }
}

fun main() {
    val view = View(object : Context {})
    println(view.ctx)
    println(view.attr)
}
