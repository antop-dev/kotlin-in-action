package org.antop.kotlin.chapter3

fun parsePath(path: String) {
    // val regex = "(.+)/(.+)\\.(.+)".toRegex()
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchEntire = regex.matchEntire(path)
    if (matchEntire != null) {
        val (directory, filename, extension) = matchEntire.destructured
        println("Dir: $directory, name: $filename, ext: $extension")
    }
}

fun main() {
    parsePath("/Users/antop/kotlin book/chapter.adoc")
}
