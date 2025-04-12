/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warcardgroup7;

import java.util.Scanner;

/**
 *
 * @author khali_jwhe8us
 */
public class GameView {
    private Scanner scanner = new Scanner(System.in);

    public String promptUsername(int playerNumber) {
        System.out.println("Enter Player " + playerNumber + " Username:");
        return scanner.nextLine();
    }

    public String promptPassword(int playerNumber) {
        String password;
        do {
            System.out.println("Enter Player " + playerNumber + " Password:");
            System.out.println("Password must have min length 6, 1 uppercase letter, and 1 digit");
            password = scanner.nextLine();
        } while (!PasswordValidator.isValid(password));
        return password;
    }

    public int promptMaxRounds() {
        System.out.println("Enter Maximum number of rounds:");
        return scanner.nextInt();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
    
}

