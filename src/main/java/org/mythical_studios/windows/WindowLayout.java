package org.mythical_studios.windows;

import javax.swing.*; // Import Swing components
import java.awt.*; // Import AWT components

public class WindowLayout {
    private JFrame frame;

    // Constructor to initialize with a JFrame
    public WindowLayout(JFrame frame) {
        this.frame = frame;
    }

    // Method to set the window to fullscreen
    public void setFullScreen() {
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        if (gd.isFullScreenSupported()) {
            frame.dispose(); // Dispose of the current frame
            frame.setUndecorated(true); // Remove title bar and borders
            gd.setFullScreenWindow(frame); // Set the window to fullscreen
        } else {
            System.out.println("Fullscreen not supported.");
        }
    }

    // Method to maximize the window
    public void setMaximized() {
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize the window
        frame.setVisible(true); // Ensure the window is visible
    }
}