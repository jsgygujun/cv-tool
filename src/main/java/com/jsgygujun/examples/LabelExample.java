package com.jsgygujun.examples;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.net.InetAddress;

/**
 * @author GuJun
 * @date 2020/8/25
 */
public class LabelExample {

    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        label.setBounds(50, 50, 150, 20);
        JButton button = new JButton("Find IP");
        button.setBounds(50, 100, 95, 30);

        frame.add(button);button.addActionListener((ActionEvent event) -> {
            label.setText("127.0.0.1");
        });
        frame.add(label);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
