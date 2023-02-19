package org.antop.kotlin.chapter4

class Window {
    private val mouseListeners = mutableListOf<MouseListener>()
    fun addMouseListener(listener: MouseListener) {
        mouseListeners += listener
    }
}

class MouseEvent(val x: Int, val y: Int)

interface MouseListener {
    fun mouseClicked(e: MouseEvent)
    fun mouseEntered(e: MouseEvent)
}

abstract class MouseAdapter : MouseListener

class KeyboardEvent(val key: Char)

interface KeyboardListener {
    fun keyPress(e: KeyboardEvent)
}

fun main() {
    val listener = object : MouseAdapter(), KeyboardListener {
        override fun mouseClicked(e: MouseEvent) {
            println("mouse clicked -> ${e.x}, ${e.y}")
        }

        override fun mouseEntered(e: MouseEvent) {
            println("mouse entered -> ${e.x}, ${e.y}")
        }

        override fun keyPress(e: KeyboardEvent) {
            println("key pressed -> '${e.key}'")
        }
    }

    val window = Window()
    window.addMouseListener(listener)
}
