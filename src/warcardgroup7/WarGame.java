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

public class WarGame {
   private Player p1, p2;
    private int maxRounds;
    
    public WarGame(Player p1, Player p2, int maxRounds) {
        this.p1 = p1;
        this.p2 = p2;
        this.maxRounds = maxRounds;
    }
    
    public void play() {
        int round = 0;
        while (p1.hasCards() && p2.hasCards() && round < maxRounds) {
            playRound();
            round++;
        }
        declareWinner();
    }
    
    private void playRound() {
        Card card1 = p1.drawCard();
        Card card2 = p2.drawCard();
        
        if (card1 == null || card2 == null) return;
        
        System.out.println(p1.getUsername() + " plays " + card1);
        System.out.println(p2.getUsername() + " plays " + card2);
        
        if (card1.getValue() > card2.getValue()) {
            p1.addCard(card1);
            p1.addCard(card2);
            System.out.println(p1.getUsername() + " wins the round!");
        } else if (card1.getValue() < card2.getValue()) {
            p2.addCard(card1);
            p2.addCard(card2);
            System.out.println(p2.getUsername() + " wins the round!");
        } else {
            handleWar(card1, card2);
        }
    }
    
    private void handleWar(Card card1, Card card2) {
        System.out.println("War!");
        List<Card> warPile = new ArrayList<>(Arrays.asList(card1, card2));
        
        if (p1.getHandSize() < 4 || p2.getHandSize() < 4) {
            return;
        }
        
        for (int i = 0; i < 3; i++) {
            warPile.add(p1.drawCard());
            warPile.add(p2.drawCard());
        }
        
        Card warCard1 = p1.drawCard();
        Card warCard2 = p2.drawCard();
        warPile.add(warCard1);
        warPile.add(warCard2);
        
        System.out.println(p1.getUsername() + " plays " + warCard1);
        System.out.println(p2.getUsername() + " plays " + warCard2);
        
        if (warCard1.getValue() > warCard2.getValue()) {
            for (Card c : warPile) p1.addCard(c);
            System.out.println(p1.getUsername() + " wins the war!");
        } else if (warCard1.getValue() < warCard2.getValue()) {
            for (Card c : warPile) p2.addCard(c);
            System.out.println(p2.getUsername() + " wins the war!");
        } else {
            handleWar(warCard1, warCard2);
        }
    }
    
    private void declareWinner() {
        if (p1.getHandSize() > p2.getHandSize()) {
            System.out.println("The winner is " + p1.getUsername() + " with " + p1.getHandSize() + " cards!");
        } else if (p1.getHandSize() < p2.getHandSize()) {
            System.out.println("The winner is " + p2.getUsername() + " with " + p2.getHandSize() + " cards!");
        } else {
            System.out.println("It's a tie! Both players have " + p1.getHandSize() + " cards.");
        }
    }
    
    
}