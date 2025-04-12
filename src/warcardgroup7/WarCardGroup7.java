/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package warcardgroup7;

/**
 *
 * @author khali_jwhe8us
 */
public class WarCardGroup7 {


    public static void main(String[] args) {
        GameView view = new GameView();
        GameController controller = new GameController(view);
        controller.startGame();
    }
}


