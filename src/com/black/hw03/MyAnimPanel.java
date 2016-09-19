package com.black.hw03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tanner on 9/18/16.
 */

public class MyAnimPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    private final int WIDTH = 400;
    private final int HEIGHT = 400;
    private final int IMAGE_SIZE = 350;

    int DELAY = 40;

    private ImageIcon image;

    private Timer timer;

    private int x = 0, y = 0, moveX = 10, moveY = 10;

    JButton startButton;
    JButton stopButton;

    public MyAnimPanel() {

        image = new ImageIcon("lego.gif");
        timer = new Timer(DELAY, new ReboundListener());

        x = 0;
        y = 40;
        moveX = moveY = 3;

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.black);
        timer.start();

        startButton = new JButton("Start");
        stopButton = new JButton("Stop");

        startButton.addActionListener(new StartButtonHandler());
        stopButton.addActionListener(new StopButtonHandler());
        add(startButton, BorderLayout.NORTH);
        add(stopButton, BorderLayout.SOUTH);
    }

    public void setDELAY(int delay) {
        DELAY = delay;
    }

    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        image.paintIcon(this, page, x, y);
    }

    private class StartButtonHandler implements ActionListener {
        public void actionPerformed(final ActionEvent e) {
            System.out.println("start");
            setDELAY(40);
            timer.start();
        }
    }

    private class StopButtonHandler implements ActionListener {
        public void actionPerformed(final ActionEvent e) {
            System.out.println("stop");
            setDELAY(0);
            timer.stop();
        }
    }

    private class ReboundListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            x += moveX;
            y += moveY;

            if (x <= 0 || x >= WIDTH  - IMAGE_SIZE) { moveX *= -1; }
            if (y <= 0 || y >= HEIGHT - IMAGE_SIZE) { moveY *= -1; }

            repaint();
        }
    }
}