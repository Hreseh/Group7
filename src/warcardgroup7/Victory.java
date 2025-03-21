/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warcardgroup7;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author khali_jwhe8us
 */
public class Victory {
    
    private int maxRounds;
    
    public Victory(int maxRounds) {
        this.maxRounds = maxRounds;
    }
    
    public boolean isGameOver(List<Player> players, int round) {
        return round >= maxRounds || players.stream().anyMatch(p -> p.getHandSize() == 52);
    }
    
    public Player getWinner(List<Player> players) {
        return players.stream().max(Comparator.comparingInt(Player::getHandSize)).orElse(null);
    }
    
}