/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoretennis;

import java.util.Scanner;

/**
 *
 * @author Matheus Alano Joenck
 */
public class ScoreTennis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nome = new Scanner(System.in);
        System.out.println("Nome do Player 1: ");
        Player player1 = new Player("Matheus"/*nome.nextLine()*/);
        System.out.println("Nome do Player 2: ");
        Player player2 = new Player("Pedro"/*nome.nextLine()*/);
        
        Game game = new Game(player1, player2);
        Score score = new Score(game);
        
        Scanner whoScore = new Scanner(System.in);
        while (!game.somebodyWon()) {
            score.scoreBord();
            System.out.print("Who score? : ");
            game.setScore(whoScore.nextInt());            
        }
        score.scoreBord();
    }
}
