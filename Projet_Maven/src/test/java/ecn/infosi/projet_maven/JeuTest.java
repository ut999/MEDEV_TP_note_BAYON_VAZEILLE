/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ecn.infosi.projet_maven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Clément
 */
public class JeuTest {
    
    public JeuTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }



    /**
     * Test of hasPlayerWon method, of class Jeu.
     */
    @Test
    public void testHasPlayerWon() {
        System.out.println("hasPlayerWon");
        EtatJeu jeu1 = new EtatJeu();
        EtatJeu jeu2 = new EtatJeu();
        Jeu instance = new Jeu();
        
        jeu1.getWordLetters().add("o");
        
        boolean expResult1 = false;
        boolean result1 = instance.hasPlayerWon(jeu1);
        assertEquals(expResult1, result1);
        
        boolean expResult2 = true;
        boolean result2 = instance.hasPlayerWon(jeu2);
        assertEquals(expResult2, result2);
    }

    /**
     * Test of hasPlayerLost method, of class Jeu.
     */
    @Test
    public void testHasPlayerLost() {
        System.out.println("hasPlayerLost");
        EtatJeu jeu1 = new EtatJeu();
        EtatJeu jeu2 = new EtatJeu();
        Jeu instance = new Jeu();
        
        jeu1.setMaxErrors(10);
        
        boolean expResult1 = false;
        boolean result1 = instance.hasPlayerLost(jeu1);
        assertEquals(expResult1, result1);
        
        boolean expResult2 = true;
        boolean result2 = instance.hasPlayerLost(jeu2);
        assertEquals(expResult2, result2);
    }
    
}
