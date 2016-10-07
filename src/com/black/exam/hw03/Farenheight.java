package com.black.exam.hw03;

import javax.swing.*;
import java.awt.*;

/**
 * Created by tanner on 9/18/16.
 */
public class Farenheight extends JPanel { //Poorly Name Panel
    JButton ctof = new JButton();
    JButton ftoc = new JButton();
    JTextArea output = new JTextArea();
    JTextArea input = new JTextArea();

    public Farenheight(){

        input.setPreferredSize(new Dimension(100,25));
        output.setPreferredSize(new Dimension(100,25));

        ctof.addActionListener(actionEvent -> {
            double temp_before = Double.parseDouble(input.getText());
            double temp_f = (temp_before*(9.0/5.0))+32.0;
            String out = temp_f+"";
            output.setText(out.substring(0,4)+" F");
        });
        ftoc.addActionListener(actionEvent -> {
            double temp_before = Double.parseDouble(input.getText());
            double temp_c = (5.0/9.0*(temp_before-32.0));
            String out = temp_c+"";
            output.setText(out.substring(0,4)+" C");
        });

        output.setEditable(false);
        ctof.setText("C to F");
        ftoc.setText("F to C");

        add(ctof);
        add(ftoc);
        add(input);
        add(output);
    }


}
