package org.antop.kotlin.chapter7

import java.math.BigDecimal

operator fun BigDecimal.inc() = this + BigDecimal.ONE
