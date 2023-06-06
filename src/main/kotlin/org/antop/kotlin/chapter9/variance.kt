package org.antop.kotlin.chapter9

fun printContents(list: List<Any>) {
    println(list.joinToString())
}

fun addAnswer(list: MutableList<Any>) {
    list += 42
}

// 동물
open class Animal {
    fun feed() {
        println("eating...")
    }
}

// 동물 무리
class Herd<out T : Animal>(
    val leadAnimal: T,
    private vararg val animals: T
) {
    val size: Int get() = animals.size
    operator fun get(i: Int): T = animals[i]
}

// 모두에게 밥을 먹이다
fun feedAll(animals: Herd<Animal>) {
    for (i in 0 until animals.size) {
        val animal = animals[0]
        animal.feed()
    }
}

class Cat : Animal() {
    fun cleanLitter() {}
}

fun takeCareOfCats(cats: Herd<Cat>) {
    for (i in 0 until cats.size) {
        cats[i].cleanLitter()
    }
    feedAll(cats) // 편안~
}

fun printSum(c: Collection<Int>) {
    val intList = c as? List<Int>
        ?: throw IllegalArgumentException("List is expected")
    print(intList.sum())
}

fun <T> copyData(source: List<T>, destination: MutableList<T>) {
    for (item in source) {
        destination += item
    }
}

fun main() {
    printContents(listOf("abc", "bac"))

    val strings = mutableListOf("abc", "def")
//    addAnswer(strings)

    val value: Any? = null
//    value is List<String> // Kotlin: Cannot check for instance of erased type: List<String>
    value is List<*> // 스타 프로젝션을 사용해서 리스트인지만 검사하기

    printSum(listOf(1, 2, 3))
//    printSum(setOf(1, 2, 3)) // java.lang.IllegalArgumentException: List is expected

    val herd = Herd(Cat(), Cat(), Cat())
    takeCareOfCats(herd)

    val ints = mutableListOf(1, 2, 3)
    val anyItems = mutableListOf<Any>()
    copyData(ints, anyItems)
    println(anyItems) // [1, 2, 3]
}
