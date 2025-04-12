/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warcardgroup7;



/**
 *
 * @author khali_jwhe8us
 */


import java.util.*;
public class Player extends User {
    private Queue<Card> hand = new LinkedList<>();

    public Player(String username, String password) {
        super(username, password);
    }

    public void addCard(Card card) { 
        hand.offer(card); 
    }
    public Card drawCard() {
        return hand.poll(); 
    }
    public boolean hasCards() { 
        return !hand.isEmpty();
    }
    public int getHandSize() {
        return hand.size(); 
    }
    
}