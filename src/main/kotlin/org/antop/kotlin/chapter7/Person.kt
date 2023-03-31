package org.antop.kotlin.chapter7

class Person(val name: String, age: Int, salary: Int) : PropertyChangeAware() {
    var age: Int by ObservableProperty(age, changeSupport)
    var salary: Int by ObservableProperty(salary, changeSupport)

    override fun toString(): String {
        return "Person(name='$name', age=$age, salary=$salary)"
    }
}

fun main() {
    val p = Person("antop", 41, 1000)
    p.addPropertyChangeListener { e ->
        println("Property ${e.propertyName} changed from ${e.oldValue} to ${e.newValue}")
    }

    println(p)      // Person(name='antop', age=41, salary=1000)
    p.age = 39      // Property age changed from 41 to 39
    p.salary = 2000 // Property salary changed from 1000 to 2000
    println(p)      // Person(name='antop', age=39, salary=2000)

}
