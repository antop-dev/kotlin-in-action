package org.antop.kotlin.chapter5

import org.antop.java.chapter5.Button
import org.antop.java.chapter5.OnClickListener
import org.antop.java.chapter5.View

fun createAllDoneRunnable(): Runnable {
    return Runnable { println("All done!") }
}

fun main() {
    createAllDoneRunnable().run()

    val button1 = Button()
    val button2 = Button()
//    val listener = OnClickListener { view ->
//        print("view clicked -> $view")
//    }
    val listener = object : OnClickListener {
        override fun onClick(view: View?) {
            print("view clicked -> $view")
        }
    }
    button1.setOnClickListener(listener)
    button2.setOnClickListener(listener)

}
