package com.black.hw02;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Created by tanner on 9/12/16.
 */
public class GUI {

    JFrame frame = new JFrame();
    JPanel pnl = new JPanel();
    JTextArea ta = new JTextArea();

    public GUI(String URL, String Content) throws IOException {

        ta.setText(Content);

        ta.setPreferredSize(new Dimension(200,200));
        pnl.setPreferredSize(new Dimension(200,200));
        frame.setPreferredSize(new Dimension(400,400));

        pnl.add(ta);
        frame.add(pnl,BorderLayout.PAGE_START);
        frame.add(new ImageTool(URL).getPanel(),BorderLayout.CENTER);
        frame.pack();
        pnl.setVisible(true);
        frame.setVisible(true);

    }


}
