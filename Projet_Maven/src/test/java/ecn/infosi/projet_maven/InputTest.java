/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ecn.infosi.projet_maven;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author utaab
 */
public class InputTest {
    
    public InputTest() {
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
     * Test for invalid letters.
     */
    @Test
    public void testReadPlayerCharacterTry_InvalidCharacter() {
        System.out.println("readPlayerCharacterTry c");

        String expResult = "a";

        // Simuler l'entrée utilisateur invalide puis valide
        String input = "!\na\n";  // "!" puis "aa" et enfin "a" avec retour à la ligne
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Lettres déjà essayées
        ArrayList<String> previousTries = new ArrayList<>();

        // Instance de la classe Input
        Input instance = new Input();
        String result = instance.readPlayerCharacterTry(previousTries);

        assertEquals(expResult, result);
    }
    
    /**
     * Test for repeated letters.
     */
    @Test
    public void testReadPlayerCharacterTry_RepeatedCharacter() {
        System.out.println("readPlayerCharacterTry c");

        String expResult = "a";

        // Simuler l'entrée utilisateur invalide puis valide
        String input = "aa\na\n";  // "!" puis "aa" et enfin "a" avec retour à la ligne
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Lettres déjà essayées
        ArrayList<String> previousTries = new ArrayList<>();

        // Instance de la classe Input
        Input instance = new Input();
        String result = instance.readPlayerCharacterTry(previousTries);

        assertEquals(expResult, result);
    }
}
