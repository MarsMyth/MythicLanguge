package org.mythical_studios.windows;

import javax.swing.*;
import java.awt.event.ActionListener;

public class WindowButton extends JButton {

    // Constructor to create a button with a label
    public WindowButton(String label) {
        super(label);
        initialize(); // Call initialization method
    }

    // Method to initialize the button properties
    private void initialize() {
        // You can customize button properties here
        setFocusable(false); // Prevents the button from being focused
        // Additional customizations can be added here
    }

    // Custom method to set an action listener
    public void addClickListener(ActionListener listener) {
        addActionListener(listener);
    }

    // Custom method to change the button text
    public void setLabel(String label) {
        setText(label);
    }
}
