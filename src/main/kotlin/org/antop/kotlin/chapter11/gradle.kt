package org.antop.kotlin.chapter11

class DependencyHandler {
    // 일반적인 명령형 API를 정의
    fun compile(coordinate: String) {
        println("Added dependency on $coordinate")
    }

    // "invoke"를 정의해 DSL 스타일 API를 제공
    operator fun invoke(body: DependencyHandler.() -> Unit) = body()
}

fun main() {
    val dependencies = DependencyHandler()
    dependencies.compile("org.jetbrains.kotlin:kotlin-stdlib:1.0.0")
    // 두가지 관례를 사용했다.
    // 1. a.invoke()는 a()와 같다.
    // 2. 인자의 마지막 인자가 함수일 경우 밖으로 뺄 수 있다.
    dependencies {
        compile("org.jetbrains.kotlin:kotlin-reflect:1.0.0")
    }
}
