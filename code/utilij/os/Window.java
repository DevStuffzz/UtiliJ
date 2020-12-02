package utilij.os;

import javax.swing.*;
import java.awt.*;

public class Window {
    private JFrame frame;
    private JPanel panel;

    private int width, height;

    public Window(int width, int height, String title) {
        this.width = width;
        this.height = height;

        frame = new JFrame(title);
        frame.setSize(width, height);

        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(false);

        panel = new JPanel();
        panel.setSize(width, height);
        frame.add(panel);
    }

    public void close() {
        frame.setVisible(false);
        frame.dispose();
    }

    public void setColor(Color color) {
        panel.setBackground(color);
    }

    public void show() {
        frame.setVisible(true);
    }

    public void add(Component component) {
        panel.add(component);
    }
}
