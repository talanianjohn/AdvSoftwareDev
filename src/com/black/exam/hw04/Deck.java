package com.black.exam.hw04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by tanner on 9/24/16.
 *
 * Created a template class because I can
 * Data structure class for the T being handled
 */
public class Deck<T>{

    private List<Object> deck;
    private int count=0;

    public Deck(){

    }

    public void StackDeck(){

        deck = new ArrayList<>();
        for (int i = 1; i <= 13; i++) {
            for (int j = 1; j <= 4; j++) {
                deck.add(new Card(j,i));
            }
        }
        Shuffle();

    }

    public void Shuffle(){
            Collections.shuffle(deck);
    } // Rearrange the deck using the Collections class

    public T drawCard(){// Get the card to from the deck and prep it for the table
        T card = (T)deck.get(count++);

        System.out.println(count+" "+deck.get(count++).toString());
        return card;
    }
    
    public String toString(){
        String res = "";
        System.out.println(deck.size());
        return res;
        
    }

}
