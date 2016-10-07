package com.black.exam.hw02;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by tanner on 9/12/16.
 */
public class ImageTool extends JPanel {

    Image img = null;
    ImageIcon icon = null;

    public ImageTool(String link) throws MalformedURLException {

        URL url = new URL(link);

        try {
            img = ImageIO.read(url);
            img = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            this.icon = new ImageIcon(img);
            System.out.println("Image width: " + icon.getIconWidth());
            System.out.println("Image height: " + icon.getIconHeight());

        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public JLabel getPanel() throws MalformedURLException {

        JLabel imgLabel = new JLabel(icon);
        imgLabel.setPreferredSize(new Dimension(300,300));
        return imgLabel;
    }

}