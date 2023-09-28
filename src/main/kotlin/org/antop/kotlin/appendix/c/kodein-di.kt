package org.antop.kotlin.appendix.c

import org.kodein.di.DI
import org.kodein.di.DIAware
import org.kodein.di.bindProvider
import org.kodein.di.instance
import java.security.SecureRandom
import java.util.*

val di = DI {
    bindProvider<Random> { SecureRandom() }
}

class Presenter(override val di: DI) : DIAware {
    private val rnd: Random by di.instance()
    fun random() = rnd.nextInt()
}

fun main() {
    val presenter = Presenter(di)
    println("random = ${presenter.random()}")
}
