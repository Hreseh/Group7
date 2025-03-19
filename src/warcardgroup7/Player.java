/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warcardgroup7;

import java.util.*;


/**
 *
 * @author khali_jwhe8us
 */
public class Player {

     public Queue<Card> hand = new LinkedList<>();
    
    public Player(String username, String password) {
        super(username, password);
    }
    
    public void addCard(Card card) {
        hand.offer(card); 
    }
    public Card drawCard() {
        return hand.poll(); 
    }
    public int getHandSize() {
        return hand.size();
    }
    public boolean hasCards() {
        return !hand.isEmpty(); 
    }
   
}
