package org.antop.java.chapter4;

import org.antop.kotlin.chapter4.MouseAdapter;
import org.antop.kotlin.chapter4.MouseEvent;
import org.antop.kotlin.chapter4.MouseListener;
import org.antop.kotlin.chapter4.Window;
import org.jetbrains.annotations.NotNull;

public class WindowMain {
    public static void main(String[] args) {
        MouseListener listener = new MouseAdapter() {
            @Override
            public void mouseClicked(@NotNull MouseEvent e) {
                System.out.println("mouse clicked on " + e.getX() + ", " + e.getY());
            }

            @Override
            public void mouseEntered(@NotNull MouseEvent e) {
                System.out.println("mouse entered on " + e.getX() + ", " + e.getY());
            }
        };

        Window window = new Window();
        window.addMouseListener(listener);
    }
}
