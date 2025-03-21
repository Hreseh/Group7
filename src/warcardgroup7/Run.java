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
public class Run {
    
    public static void start(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Player 1 Username: ");
        String user1 = scanner.nextLine();
        String pass1;
        do{
            System.out.println("Enter Player 1 Password: ");
            System.out.println("Password must have min length 6 and 1 uppercase Letter");
            pass1 = scanner.nextLine();
        }
        while(!PasswordValidator.isValid(pass1));
        
        System.out.println("Enter Player2 username: ");
        String user2 = scanner.nextLine();
        String pass2;
        do{
            System.out.println("Enter Player 2 Password: ");
            System.out.println("Password must have min length 6 and 1 uppercase Letter");
            pass2 = scanner.nextLine();
        }
         while(!PasswordValidator.isValid(pass1));
        System.out.println("Enter Maximum number of rounds: ");
        int maxRounds = scanner.nextInt();
        
        Player p1 = new Player(user1, pass1);
        Player p2 = new Player (user2, pass2);
        
       List<Card> deck = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck.add(new Card(rank, suit));
            }
        }
        
        HandGenerator.distributeHands(deck, p1, p2);
        
        WarGame game = new WarGame(p1, p2, maxRounds);
        game.play();
    }
    
}
