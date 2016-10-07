package com.black.exam;

import com.black.exam.hw01.CustomPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by tanner on 10/7/16.
 */
public class exam {

    public static void main(String[] args) {


        JFrame frame = new JFrame ("Display File");
        frame.setPreferredSize(new Dimension(1600,500));
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        JPanel hw = new JPanel();
        JPanel hw01 = new CustomPanel();
        //JButton
        hw01.setPreferredSize(new Dimension(500,300));

        hw.add(hw01);
        frame.add(hw,BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);




    }
}
