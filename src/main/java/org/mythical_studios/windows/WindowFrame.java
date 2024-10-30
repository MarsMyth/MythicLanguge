package org.mythical_studios.windows;

import javax.swing.*;
import java.awt.*;

public class WindowFrame extends JFrame {

    // Constructor to create a window with a title
    public WindowFrame(String title) {
        super(title);
        initialize(); // Call initialization method
    }

    // Method to initialize the window properties
    private void initialize() {
        // Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the size of the window
        setSize(800, 600);
        // Set the layout (optional)
        setLayout(new BorderLayout());
        // Center the window on the screen
        setLocationRelativeTo(null);
    }

    // Custom method to add components
    public void addComponent(Component component, String position) {
        add(component, position);
    }

    // Custom method to show the window
    public void display() {
        setVisible(true);
    }
}
