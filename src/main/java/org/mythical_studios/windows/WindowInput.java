package org.mythical_studios.windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class WindowInput {
    private JTextField inputField;

    public WindowInput(String placeholder) {
        inputField = new JTextField(placeholder, 20); // 20 columns wide
        inputField.setForeground(Color.GRAY); // Placeholder text color
        inputField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (inputField.getText().equals(placeholder)) {
                    inputField.setText("");
                    inputField.setForeground(Color.BLACK); // Change color when focused
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (inputField.getText().isEmpty()) {
                    inputField.setForeground(Color.GRAY);
                    inputField.setText(placeholder);
                }
            }
        });
    }

    public String getText() {
        return inputField.getText();
    }

    public JTextField getInputField() {
        return inputField;
    }
}
