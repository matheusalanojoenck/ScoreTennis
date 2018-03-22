/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoretennis;

/**
 * Classe responsável por exibir na tela o placar completo do jogo
 * @author matheus
 */
public class Score {
    private final Game game;

    /**
     * Inicializa o placar que será exibido ao usário,
     * recebe como parametro o 'Game' a ser exibi o placar
     * @param game
     */
    public Score(Game game) {
        this.game = game;
    }

    /**
     * Método resposável por mostrar na tela o placar ao usuário
     */
    public void scoreBord(){
        if(!game.somebodyWon()){
            System.out.println(game.playerOne.getName() + " " + game.getScore() + " " + game.playerTwo.getName());
        }else
            System.out.println(game.getScore());
            
    }
}
