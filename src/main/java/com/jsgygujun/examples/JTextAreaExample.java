package com.jsgygujun.examples;

import javax.swing.*;

/**
 * @author GuJun
 * @date 2020/8/25
 */
public class JTextAreaExample {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        JTextArea area=new JTextArea("Welcome to javatpoint");
        area.setBounds(10,30, 200,200);
        f.add(area);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
