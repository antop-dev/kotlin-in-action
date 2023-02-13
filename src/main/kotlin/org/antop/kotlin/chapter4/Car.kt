package org.antop.kotlin.chapter4

interface Car {
    val owner: String
}

// 주 생성자 안에 프로퍼티를 직접 선언
class K3(override val owner: String) : Car

class Stinger(private val spec: String) : Car {
    override val owner: String
        // 뒷받침 하는 필드가 없다.
        // 대신 매번 결과를 계산해 돌려준다.
        get() = spec.substringBefore('|')
}

class Panamera(encoded: String) : Car {
    // 초기화 단계에서 한번만 호출된다
    override val owner = parse(encoded)
}

fun parse(encoded: String) = encoded

fun main() {
    val k3 = K3("안탑")
    println("owner is ${k3.owner}")

    val stinger = Stinger("정훈|3200cc|2018")
    println("owner is ${stinger.owner}")

    val panamera = Panamera("Antop")
    println("owner is ${panamera.owner}")
}
