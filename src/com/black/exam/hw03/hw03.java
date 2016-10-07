package com.black.exam.hw03;

import javax.swing.*;
import java.awt.*;

/**
 * Created by tanner on 9/14/16.
 */
public class hw03 {

    public static void main(String[] args) {

        JFrame mainframe = new JFrame();
        TrafficLightPanel pnl = new TrafficLightPanel();
        pnl.setPreferredSize(new Dimension(200,300));

        mainframe.add(pnl,BorderLayout.NORTH);
        mainframe.add(new Farenheight(),BorderLayout.SOUTH);
        mainframe.add(new MyAnimPanel());
        mainframe.setPreferredSize(new Dimension(550,900));
        mainframe.setVisible(true);
        mainframe.pack();

    }


}
