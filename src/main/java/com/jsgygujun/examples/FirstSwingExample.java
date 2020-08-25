package com.jsgygujun.examples;

import javax.swing.*;

/**
 * @author GuJun
 * @date 2020/8/25
 */
public class FirstSwingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton buffon = new JButton("按键");
        buffon.setBounds(130, 100, 100, 40);
        frame.add(buffon);
        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
