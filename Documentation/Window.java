import utilij.os.Window;

import javax.swing.*;
import java.awt.*;

public class UtiliJDocumentation {
    public static void main(String[] args) {
        // Create the Window
        Window window = new Window(1080, 720, "UtiliJ Window");

        // You can change the color of the Window
        window.setColor(Color.CYAN);

        // The Window works with the Java swing library to add endless capabilities to your window
        JButton button = new JButton("Test Button");
        button.setBounds(100, 500, 100, 25);

        // As i said you can use items from the Swing library
        window.add(button);

        // And finally show the Window
        window.show();
        
        // And you can close the Window, and free any ram that the window has
        window.close();
    }
}
