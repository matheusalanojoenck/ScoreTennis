/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoretennis;

/**
 * Classe que guarda o nome de cada jogador
 * @author matheus
 */
public class Player {
    
    private final String name;

    /**
     * Inicializa o jogador recebendo como parâmetro o nome do jogador 
     * @param name
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * Retorna o nome do jogador
     * @return name
     */
    public String getName() {
        return name;
    }

    
    
    
    

}