package org.antop.kotlin.chapter4

open class RichButton : Clickable { // 상속 가능
    fun disable() {} // 오버라이드 불가능
    open fun animate() {} // 오버라이드 가능
    override fun click() {} // 상위 클래스가 열려 있기 때문에 가능
}
