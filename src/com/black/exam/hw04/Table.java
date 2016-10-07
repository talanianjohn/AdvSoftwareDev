package com.black.exam.hw04;

import javax.swing.*;
import java.awt.*;

/**
 * Created by tanner on 9/24/16.
 */
public class Table{

    JFrame frame = new JFrame();
    JPanel tbl = new JPanel();
    JPanel dealer = new JPanel();

    public JPanel getCtrls() {
        return ctrls;
    }

    JPanel ctrls=new JPanel();

    public JPanel getTbl() {
        return tbl;
    }

    public Table(){

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
        frame.setTitle("Card Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dealer.setPreferredSize(new Dimension(1600,250));
        tbl.setPreferredSize(new Dimension(1600,250));
        frame.setPreferredSize(new Dimension(1600,1000));
        //frame.add(dealer, BorderLayout.NORTH);
        frame.add(tbl,BorderLayout.CENTER);//build the inner layout
        frame.add(ctrls,BorderLayout.SOUTH);//add controls
        tbl.setVisible(true);
        frame.setVisible(true);
        frame.pack();

    }

    public void addPlayerCard(Card card){ //adds a card from a source and refreshes the GUI
        tbl.add(card);
        tbl.revalidate();
    }

    public void addDealerCard(Card card){
        dealer.add(card);
        tbl.revalidate();
    }



}
