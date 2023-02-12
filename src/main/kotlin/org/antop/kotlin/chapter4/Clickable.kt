package org.antop.kotlin.chapter4

interface Clickable {
    fun click() // 추상 메서드

    // 디폴트 구현
    fun showOff() {
        println("I'm clickable!")
    }
}
