package org.antop.kotlin.chapter4

import java.nio.file.Path
import java.nio.file.Paths

object CaseInsensitiveFileComparator : Comparator<Path> {
    override fun compare(o1: Path, o2: Path): Int {
        val filename1 = o1.fileName.toString()
        val filename2 = o2.fileName.toString()
        return filename1.compareTo(filename2, ignoreCase = true)
    }
}

fun main() {
    println(
        CaseInsensitiveFileComparator.compare(
            Paths.get("/User"),
            Paths.get("/user")
        )
    )

    val paths = listOf(Paths.get("/Z"), Paths.get("/a"))
    println(paths.sortedWith(CaseInsensitiveFileComparator))
}
