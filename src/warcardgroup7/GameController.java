/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warcardgroup7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khali_jwhe8us
 */
public class GameController {
    private GameView view;

    public GameController(GameView view) {
        this.view = view;
    }

    public void startGame() {
        String user1 = view.promptUsername(1);
        String pass1 = view.promptPassword(1);
        String user2 = view.promptUsername(2);
        String pass2 = view.promptPassword(2);
        int maxRounds = view.promptMaxRounds();

        Player p1 = new Player(user1, pass1);
        Player p2 = new Player(user2, pass2);

        List<Card> deck = createDeck();
        HandGenerator.distributeHands(deck, p1, p2);

        WarGame game = new WarGame(p1, p2, maxRounds, view);
        game.play();
    }

    private List<Card> createDeck() {
        List<Card> deck = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck.add(new Card(rank, suit));
            }
        }
        return deck;
    }
    
}