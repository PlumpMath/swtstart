package org.cinsk.swtstart;

import org.eclipse.swt.widgets.*;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("Hello, world");

        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setText("Hello, world");
        shell.setSize(200, 100);
        shell.open();

        while (!shell.isDisposed()) {
            if (!display.readAndDispatch())
                display.sleep();
        }

        display.dispose();
    }
}
