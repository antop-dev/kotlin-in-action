package org.antop.kotlin.chapter11

class Greeter(private val greeting: String) {
    operator fun invoke(name: String) {
        println("$greeting $name!")
    }
}

data class Issue(
    val id: String,
    val project: String,
    val type: String,
    val priority: String,
    val description: String
)

class ImportantIssuesPredicate(private val project: String) : (Issue) -> Boolean { // 함수타입을 부모 클래스로 사용한다.
    // "invoke" 메서드를 구현한다.
    override fun invoke(issue: Issue): Boolean {
        return issue.project == project && issue.isImportant()
    }

    private fun Issue.isImportant(): Boolean {
        return type == "Bug" && (priority == "Major" || priority == "Critical")
    }
}

fun main() {
    val bavarianGreeter = Greeter("Servus")
    // bavarianGreeter.invoke("Dmitry")
    bavarianGreeter("Dmitry")

    val i1 = Issue("IDEA-154446", "IDEA", "Bug", "Major", "Save settings failed")
    val i2 = Issue(
        "KT-12183",
        "Kotlin",
        "Feature",
        "Normal",
        "Intention: convert several calls on the same receiver to with/apply"
    )

    val predicate = ImportantIssuesPredicate("IDEA")

    for (issue in listOf(i1, i2).filter(predicate)) { // 술어를 filter()에게 넘긴다.
        println(issue.id)
    }
}
