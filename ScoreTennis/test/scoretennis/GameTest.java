/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoretennis;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matheus
 */
public class GameTest {
    public Player playerOne = new Player("Matheus");
    public Player playerTwo = new Player("Matheus");
    public Game game = new Game(playerOne, playerTwo);
    
    public GameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     *
     * @return
     */
    public boolean setTestGame00(){
        game.setPlayerOneScore(0);
        game.setPlayerTwoScore(0);
        return "LOVE | LOVE".equals(game.getScore());   
    }
    
    /**
     *
     * @return
     */
    public boolean setTestGame11(){
        game.setPlayerOneScore(1);
        game.setPlayerTwoScore(1);
        return "FIFTEEN | FIFTEEN".equals(game.getScore());   
    }
    
    /**
     *
     * @return
     */
    public boolean setTestGame22(){
        game.setPlayerOneScore(2);
        game.setPlayerTwoScore(2);
        return "THIRTY | THIRTY".equals(game.getScore());   
    }
    
    /**
     *
     * @return
     */
    public boolean setTestGame33(){
        game.setPlayerOneScore(3);
        game.setPlayerTwoScore(3);
        return "DUECE".equals(game.getScore());   
    }
    
    /**
     *
     * @return
     */
    public boolean setTestGame43(){
        game.setPlayerOneScore(4);
        game.setPlayerTwoScore(3);
        return "ADVANTAGE | ".equals(game.getScore());   
    }
    
    /**
     *
     * @return
     */
    public boolean setTestGame34(){
        game.setPlayerOneScore(3);
        game.setPlayerTwoScore(4);
        return " | ADVANTAGE".equals(game.getScore());   
    }
    
    /**
     * 
     * @return
     */
    public boolean setTestGame42(){
        game.setPlayerOneScore(4);
        game.setPlayerTwoScore(2);
        return (game.playerOne.getName()+" won the game").equals(game.getScore());   
    }
    
    /**
     *
     * @return
     */
    public boolean setTestGame24(){
        game.setPlayerOneScore(2);
        game.setPlayerTwoScore(4);
        return (game.playerTwo.getName()+" won the game").equals(game.getScore());   
    }

    /**
     * Test of setScore method, of class Game.
     */
    @Test
    public void testSetScore() {
        assertEquals(true, this.setTestGame00());
        assertEquals(true, this.setTestGame11());
        assertEquals(true, this.setTestGame22());
        assertEquals(true, this.setTestGame33());
        assertEquals(true, this.setTestGame43());
        assertEquals(true, this.setTestGame34());
        assertEquals(true, this.setTestGame42());
        assertEquals(true, this.setTestGame24());
    }

    /**
     * Test of somebodyWon method, of class Game.
     */
    @Test
    public void testSomebodyWon(){
    }

    /**
     * Test of getScore method, of class Game.
     */
    @Test
    public void testGetScore(){
    }
    
}
