package com.black.hw03;

import java.awt.*;

public class Circle {
    private int		diameter, x, y;
    private Color	color;

    //This class draws a circle

    public Circle(int size, Color shade, int upperX, int upperY) { // Circle Constructor
        diameter = size;
        color = shade;
        x = upperX;
        y = upperY;
    }

    public void draw(Graphics page) {
        page.setColor(color);
        page.fillOval(x, y, diameter, diameter); // creates a circle
    }


    public void setColor(Color shade) {
        color = shade;
    }//Sets the color of the circle

}