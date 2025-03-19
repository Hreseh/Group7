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
public class HandGenerator {
        public static void distributeHands(List<Card> deck, Player p1, Player p2) {
        Collections.shuffle(deck);
        for (int i = 0; i < deck.size(); i++) {
            if (i % 2 == 0) {
                p1.addCard(deck.get(i));
            } else {
                p2.addCard(deck.get(i));
            }
        }
    }
    
}
