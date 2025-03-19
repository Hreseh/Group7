/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warcardgroup7;

/**
 *
 * @author khali_jwhe8us
 */
public class Card {
    private final Rank rank;
    private final Suit suit;
    
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }
    
    public Rank getRank() { 
        return rank; 
    }
    public int getValue() { 
        return rank.getValue(); 
    }
    
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
