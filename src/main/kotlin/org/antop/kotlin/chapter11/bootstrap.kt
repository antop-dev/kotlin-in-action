package org.antop.kotlin.chapter11

import kotlinx.html.*
import kotlinx.html.stream.createHTML

fun UL.item(href: String, name: String) = li { a(href) { +name } }

fun UL.divider() = li { role = "separator"; classes = setOf("divider") }

fun UL.dropdownHeader(text: String) = li { classes = setOf("dropdown-header"); +text }

fun DIV.dropdownButton(block: BUTTON.() -> Unit) = button {
    classes = setOf("btn", "dropdown-toggle")
    block()
    span(classes = "caret")
}

fun DIV.dropdownMenu(block: UL.() -> Unit) = ul("dropdown-menu", block)

fun <R> TagConsumer<R>.dropdown(block: DIV.() -> Unit): R = div("dropdown", block)

fun buildDropdown() = createHTML().dropdown {
    dropdownButton { +"Dropdown" }
    dropdownMenu {
        item("#", "Action") // "li" 대신 "item"을 쓸 수 있다.
        item("#", "Another action")
        divider()
        dropdownHeader("Header")
        item("#", "Separated link")
    }
}

fun main() {
    val button = buildDropdown()
    println(button)
}
