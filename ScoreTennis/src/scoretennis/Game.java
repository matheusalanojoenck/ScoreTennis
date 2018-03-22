/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoretennis;

/**
 * Classe responsavel por receber qual jogador marcou o ponto e realiar a lógica
 * para exibir o placar e determinar qual jagador ganhou
 * @author matheus
 */
public class Game {
    
    private int playerOneScore = 0, playerTwoScore = 0;
    final Player playerOne, playerTwo;
    private String statusPlayerOne, statusPlayerTwo, returnStatusGame;

    /**
     * Inicializa o placar do jogo recebendo os jagadores participantes 
     * @param playerOne
     * @param playerTwo
     */
    public Game(Player playerOne, Player playerTwo){
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }
    
    /**
     * Soma 1 ao placar do jogador que marcou ponto, recebe um tipo 'int'
     * 1 se o playerOne marcou ponto ou 2 se o playerTwo marcou ponto.
     * @param whoScore
     */
    public void setScore(int whoScore){
        switch (whoScore){
            case 1:
                playerOneScore += 1;
                break;
            case 2:
                playerTwoScore += 1;
                break;
        }
    }
    
    /**
     * Verifica se alguem jogador ganhou o jogo
     * @return retorna true se alguem ganhou ou retorna false se ninguem ganhou
     */
    public boolean somebodyWon (){
        if(playerOneScore>=4 || playerTwoScore>=4){
            if(playerOneScore-playerTwoScore>=2){
                return true;
            } else return playerTwoScore-playerOneScore >= 2; 
        }else
            return false;
    }
    
    /**
     * Verifica o status do placar de cada jogador e retorna o placar em forma de String,
     * no formato pré determinado 'FIFTEEN | FIFTEEN'
     * @return returnStatusGame
     */
    public String getScore(){
        if(playerOneScore < 4 && playerTwoScore < 4 && playerOneScore+playerTwoScore != 6){
            switch(playerOneScore){
            case 0:
                statusPlayerOne = "LOVE";
                break;
            case 1:
                statusPlayerOne = "FIFTEEN";
                break;
            case 2:
                statusPlayerOne = "THIRTY";
                break;
            case 3:
                statusPlayerOne = "FORTY";
                break;
            default :
                statusPlayerOne = " ";
                break;
            }
            switch(playerTwoScore){
            case 0:
                statusPlayerTwo = "LOVE";
                break;
            case 1:
                statusPlayerTwo = "FIFTEEN";
                break;
            case 2:
                statusPlayerTwo = "THIRTY";
                break;
            case 3:
                statusPlayerTwo = "FORTY";
                break;
            default :
                statusPlayerTwo = " ";
                break;
            }
            returnStatusGame = statusPlayerOne + " | " + statusPlayerTwo;
            
            return returnStatusGame;
        }else{
            if(playerOneScore == playerTwoScore){
                return returnStatusGame = "DUECE";
            }else if(playerOneScore-playerTwoScore == 1){
                return returnStatusGame = "ADVANTAGE | ";
            }else if(playerTwoScore-playerOneScore == 1){
                return returnStatusGame = " | ADVANTAGE";
            }else if((playerOneScore-playerTwoScore >= 2)){
                return playerOne.getName()+" won the game";
            }else{
                return playerTwo.getName()+" won the game";
            }
        }
    }

    /**
     * Retorna o placar do playerOne no tipo 'int'
     * @return playerOneScore
     */
    public int getPlayerOneScore() {
        return playerOneScore;
    }

    /**
     * Retorna o placar do playerOne no tipo 'int'
     * @return playerTwoScore
     */
    public int getPlayerTwoScore() {
        return playerTwoScore;
    }

    /**
     * 
     * @param playerOneScore
     */
    public void setPlayerOneScore(int playerOneScore) {
        this.playerOneScore = playerOneScore;
    }

    /**
     *
     * @param playerTwoScore
     */
    public void setPlayerTwoScore(int playerTwoScore) {
        this.playerTwoScore = playerTwoScore;
    }
    
    
    
    
}
