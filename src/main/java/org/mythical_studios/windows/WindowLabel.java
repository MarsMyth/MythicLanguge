package org.mythical_studios.windows;


import javax.swing.*; // Import Swing components
import java.awt.*; // Import AWT components

public class WindowLabel {
    private JLabel label;


    // Constructor to initialize the label with text
    public WindowLabel(String text) {
        label = new JLabel(text);
        initialize(); // Set default properties
    }

    // Method to initialize default label properties
    private void initialize() {
        label.setHorizontalAlignment(SwingConstants.CENTER); // Center alignment
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 14)); // Default font
    }

    // Method to set text
    public void setText(String text) {
        label.setText(text);
    }

    // Method to set font
    public void setFont(Font font) {
        label.setFont(font);
    }

    // Method to set text color
    public void setTextColor(Color color) {
        label.setForeground(color);
    }

    // Method to set background color (optional)
    public void setBackgroundColor(Color color) {
        label.setOpaque(true); // Make the background visible
        label.setBackground(color);
    }

    // Method to get the JLabel for adding to a window
    public JLabel getLabel() {
        return label;
    }
}
