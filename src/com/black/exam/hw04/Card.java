package com.black.exam.hw04;

import javax.swing.*;
import java.awt.Color;
import java.awt.*;

/**
 * Created by tanner on 9/24/16.
 */
public class Card extends JPanel{

        // Create a playing card

        private int suit, rank;
        private String[] cardSuit = {"c", "d", "h", "s"};
        private String[] cardRank = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};


        public Card(int suit, int rank)
        {
            setPreferredSize(new Dimension(300,400));
            this.suit = suit;
            this.rank = rank;
        }
        public Card(Card c)
        {
            this.suit = c.getSuit();
            this.rank = c.getRank();
        }
        public Card(Boolean c)
        {
            this.suit = 1;
            this.rank = 1;
        }
        public void renderCard(){
            setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
            setBackground(Color.LIGHT_GRAY);
            setVisible(true);
            if(suit ==1) {add(new SuitGraphicFactory(SuitGraphicFactory.CLUB,cardRank[getRank()-1]));}
            else if(suit==2){add(new SuitGraphicFactory(SuitGraphicFactory.DIAMONDS,cardRank[getRank()-1]));}
            else if(suit==3){add(new SuitGraphicFactory(SuitGraphicFactory.HEART,cardRank[getRank()-1]));}
            else if(suit==4){add(new SuitGraphicFactory(SuitGraphicFactory.SPADE,cardRank[getRank()-1]));}
        }
        public int getSuit()
        {
            return this.suit;
        }
        public int getRank()
        {
            return this.rank;
        }
        public String getCardSuit()
        {
            return cardSuit[this.suit];
        }
        public String getCardRank()
        {
            return cardRank[this.rank];
        }

        public String toString()
        {
            return cardSuit[this.suit-1] + cardRank[this.rank-1];
        }



}
