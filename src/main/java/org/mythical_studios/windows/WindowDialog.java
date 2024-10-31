package org.mythical_studios.windows;

import javax.swing.*;


public class WindowDialog {

    // Show an informational message dialog
    public static void showInfoDialog(JFrame parent, String title, String message) {
        JOptionPane.showMessageDialog(
                parent,
                message,
                title,
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    // Show a warning message dialog
    public static void showWarningDialog(JFrame parent, String title, String message) {
        JOptionPane.showMessageDialog(
                parent,
                message,
                title,
                JOptionPane.WARNING_MESSAGE
        );
    }

    // Show an error message dialog
    public static void showErrorDialog(JFrame parent, String title, String message) {
        JOptionPane.showMessageDialog(
                parent,
                message,
                title,
                JOptionPane.ERROR_MESSAGE
        );
    }


    // Show a confirmation dialog
    public static int showConfirmDialog(JFrame parent, String title, String message) {
        return JOptionPane.showConfirmDialog(
                parent,
                message,
                title,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );
    }

}
