package com.jsgygujun.examples;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @author GuJun
 * @date 2020/8/25
 */
public class ButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        final JTextField textField = new JTextField();
        textField.setBounds(50, 50, 150, 20);
        JButton button = new JButton("按键");
        button.setBounds(50, 100, 95, 30);

        frame.add(button);button.addActionListener((ActionEvent event) -> {
            textField.setText("按键按下");
        });
        frame.add(textField);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
