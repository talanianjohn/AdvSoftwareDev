package com.black.exam.hw03;

import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tanner on 9/14/16.
 */
public class TrafficLightPanel extends JPanel {


    final int WIDTH  = 170;
    final int HEIGHT = 300;
    final int RADIUS = 30;
    private Circle circle1, circle2, circle3;
    private JButton button;
    private int color = 0;

    public TrafficLightPanel() {

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.cyan);

        circle1 = new Circle(RADIUS*2, Color.red,      (WIDTH/2)-RADIUS, (HEIGHT/4*1)-RADIUS);
        circle2 = new Circle(RADIUS*2, Color.darkGray, (WIDTH/2)-RADIUS, (HEIGHT/4*2)-RADIUS);
        circle3 = new Circle(RADIUS*2, Color.darkGray, (WIDTH/2)-RADIUS, (HEIGHT/4*3)-RADIUS);

        button = new JButton("Change");
        button.addActionListener(new ButtonListener());

        add(button);

    }


    @Override public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.gray);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        circle1.draw(g);
        circle2.draw(g);
        circle3.draw(g);
    }


    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            color = (color+1) % 3;

            switch (color) {
                case 0:
//					System.out.println("case 0");
                    circle1.setColor(Color.red);
                    circle2.setColor(Color.darkGray);
                    circle3.setColor(Color.darkGray);
                    repaint();
                    break;
                case 1:
//					System.out.println("case 1");
                    circle1.setColor(Color.darkGray);
                    circle2.setColor(Color.darkGray);
                    circle3.setColor(Color.green);
                    repaint();
                    break;
                case 2:
//					System.out.println("case 2");
                    circle1.setColor(Color.darkGray);
                    circle2.setColor(Color.yellow);
                    circle3.setColor(Color.darkGray);
                    repaint();
                    break;
                default:
                    System.err.println("Invalid case; you should not be here!");
            }

        }
    }

}
