package org.antop.kotlin.chapter6

class NoResultProcessor : Processor<Unit> {
    override fun process() {
        // return을 명시할 필요가 없다.
        // 컴파일러가 묵시적으로 return Unit을 넣어준다.
    }
}
