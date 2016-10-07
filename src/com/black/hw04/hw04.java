package com.black.hw04;

import javax.swing.*;
import java.awt.*;

/**
 * Created by tanner on 9/24/16.
 * I was in the process of making blackjack when I was given the full details. So alot of commented code so I can branch this out later.
 */
public class hw04 {
    public static int dealerScore=0,playerScore=0;
    public static boolean firstRun = true;

    public static Deck<Card> deck = new Deck();
    public static Table tbl = new Table();

    public static void main(String[] args) {


        //final int[] cardsStart = {Integer.parseInt(JOptionPane.showInputDialog(new JFrame(), "How many cards to you want?"))};

        JButton btn = new JButton();
        JButton btnHold = new JButton();
        JTextField txtInput = new JTextField();
        txtInput.setPreferredSize(new Dimension(75,25));
        deck.StackDeck();

        btn.setText("Deal");
        btnHold.setText("Hold");
        btn.addActionListener(e -> {
            tbl.getTbl().removeAll();
            int x = Integer.parseInt(txtInput.getText());
            for (int i = 0; i < x; i++) {
                PlayRound();
            }
            tbl.getTbl().repaint();
        });
        btnHold.addActionListener(e -> {
            Hold();
        });


        tbl.getCtrls().add(btn);//Poor coding practice, but show my knowledge of retrieving value by reference to modify it.
        tbl.getCtrls().add(txtInput);//Poor coding practice, but show my knowledge of retrieving value by reference to modify it.
        System.out.println(deck);
        tbl.getCtrls().repaint();// Redraw the interface to show the buttons since the GUI has already been packed.
        tbl.getCtrls().revalidate();// Verify the objects exist


    }
    public static void PlayRound(){
        Card ptmp = deck.drawCard();
        //Card dtmp = deck.drawCard();
        if(firstRun){
          //  dtmp.renderCard();
            firstRun = !firstRun;
        }
        ptmp.renderCard();
        //tbl.addDealerCard(dtmp);
        tbl.addPlayerCard(ptmp);
        //dealerScore+=dtmp.getRank();
        playerScore+=ptmp.getRank();
        System.out.println(dealerScore+"  "+playerScore);

//        if(dealerScore > 21) JOptionPane.showMessageDialog(new JFrame(), "Dealer Bust!");
//        else if(playerScore > 21) JOptionPane.showMessageDialog(new JFrame(), "Player Bust!");
//        if(playerScore == 21) JOptionPane.showMessageDialog(new JFrame(), "Chicken Dinner!");
//        if(dealerScore == 21) JOptionPane.showMessageDialog(new JFrame(), "No Chicken Dinner!");

    }
    public static void Hold(){
        if(playerScore > dealerScore){
            JOptionPane.showMessageDialog(new JFrame(), "Chicken Dinner!");
        }
        else if(playerScore < dealerScore){
            JOptionPane.showMessageDialog(new JFrame(), "No Chicken Dinner!");
        }

    }

}
