package org.antop.kotlin.chapter11

open class Tag(val name: String) {
    // 모든 중첩 태그를 저장한다.
    private val children = mutableListOf<Tag>()

    protected fun <T : Tag> doInit(child: T, init: T.() -> Unit) {
        child.init() // 자식 태그를 초기화한다.
        children += child
    }

    // 결과 HTML을 문자열로 반환하다.
    override fun toString() = "<$name>${children.joinToString("")}</$name>"
}

class TABLE : Tag("table") {
    // TR 태그 인스턴스를 새로 만들고 초기화한 다음에 TABLE 태그의 자식으로 등록한다.
    fun tr(init: TR.() -> Unit) = doInit(TR(), init)
}

class TR : Tag("tr") {
    // TD 태그의 새 인스턴스를 만들어서 TR 태그의 자식으로 등록한다.
    fun td(init: TD.() -> Unit) = doInit(TD(), init)
}

class TD : Tag("td")

fun createTable() =
    table {
        tr {
            td { }
        }
        tr {
            td { }
            td { }
        }
    }

fun table(init: TABLE.() -> Unit) = TABLE().apply(init)

fun main() {
    println(createTable()) // <table><tr><td></td></tr><tr><td></td><td></td></tr></table>
}
