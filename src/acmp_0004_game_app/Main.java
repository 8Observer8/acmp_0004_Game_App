/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acmp_0004_game_app;

import org.me.gamelib.Game;

/**
 *
 * @author Ivan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 5;
        int result = Game.game(number);
        System.out.println(result);
    }
}
