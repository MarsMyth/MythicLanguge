package org.mythical_studios.windows;

import javax.swing.*; // Import Swing components
import java.awt.*; // Import AWT components
import java.io.File; // Import File for image path handling

public class WindowIcon {
    private ImageIcon icon;



    // Constructor to initialize the icon with an image path
    public WindowIcon(String imagePath) {
        setIcon(imagePath);
    }

    // Method to set the icon using an image path
    public void setIcon(String imagePath) {
        // Check if the image file exists
        File file = new File(imagePath);
        if (file.exists()) {
            icon = new ImageIcon(imagePath);
        } else {
            System.out.println("Icon file not found: " + imagePath);
            icon = new ImageIcon("src/main/resources/mythical_studios/default_icon/icon.png");
        }
    }

    // Method to get the icon as an ImageIcon
    public ImageIcon getIcon() {
        return icon;
    }

    // Method to apply the icon to a given JFrame
    public void applyTo(JFrame frame) {
        if (icon != null) {
            frame.setIconImage(icon.getImage()); // Set the window icon
        } else {
            System.out.println("Icon not set. Cannot apply to the frame.");
        }
    }
}

