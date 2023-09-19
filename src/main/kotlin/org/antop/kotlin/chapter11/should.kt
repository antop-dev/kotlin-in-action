package org.antop.kotlin.chapter11

interface Matcher<T> {
    fun test(value: T)
}

infix fun <T> T.should(matcher: Matcher<T>) = matcher.test(this)

// DSL에서는 클래스의 첫 글자를 대문자로 해야하는 일반적인 명명 규칙을 벗어나야 할 때가 있다.
class startWith(val prefix: String) : Matcher<String> {
    override fun test(value: String) {
        if (!value.startsWith(prefix))
            throw AssertionError("String '$value' does not start with '$prefix'")
    }
}

object start

infix fun String.should(x: start): StartWrapper = StartWrapper(this)

class StartWrapper(val value: String) {
    infix fun with(prefix: String) {
        if (!value.startsWith(prefix))
            throw AssertionError("String '$value' does not start with '$prefix'")
    }
}

fun main() {
    "kotlin" should startWith("ko")
    "kotlin" should startWith("kao")
    "kotlin" should start with "ko"
}
