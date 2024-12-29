package org.mythical_studios.windows;

import javax.swing.*;

public class WindowStatusBar {
    private JLabel statusLabel;

    public WindowStatusBar() {
        statusLabel = new JLabel("Ready");
        statusLabel.setBorder(BorderFactory.createEtchedBorder());
    }

    public void setStatus(String message) {
        statusLabel.setText(message);
    }

    public JLabel getStatusLabel() {
        return statusLabel;
    }
}
