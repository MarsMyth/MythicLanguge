package org.mythical_studios.windows;

import javax.swing.*;
import java.awt.event.ActionListener;

public class WindowMenu {
    private JMenuBar menuBar;

    public WindowMenu() {
        menuBar = new JMenuBar();
    }

    public void addMenu(String menuName, String[] items, ActionListener action) {
        JMenu menu = new JMenu(menuName);
        for (String item : items) {
            JMenuItem menuItem = new JMenuItem(item);
            menuItem.addActionListener(action);
            menu.add(menuItem);
        }
        menuBar.add(menu);
    }

    public JMenuBar getMenuBar() {
        return menuBar;
    }
}
