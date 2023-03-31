package org.antop.kotlin.chapter7

class Grid(row: Int, col: Int) {
    private val array = Array(row) { Array<String?>(col) { null } }

    operator fun get(row: Int, col: Int): String? {
        return array[row][col]
    }

    operator fun set(row: Int, col: Int, s: String?) {
        array[row][col] = s
    }
}

fun main() {
    val grid = Grid(10, 20)
    grid[1, 3] = "antop"
    println(grid[1, 3]) // antop
    println(grid[0, 0]) // null
}
