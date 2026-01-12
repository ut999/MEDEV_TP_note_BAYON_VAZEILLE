/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ecn.infosi.projet_maven;

import java.util.ArrayList;
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
public class DictionnaireTest {
    
    public DictionnaireTest() {
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
     * Test of load method, of class Dictionnaire.
     */
    @Test
    public void testLoad() {
        System.out.println("load test");
        Dictionnaire dictionnaire = new Dictionnaire("init.txt");
        System.out.println("dictionnaire cree");
        dictionnaire.load();
        System.out.println("load good");
    }

    /**
     * Test of randomWord method, of class Dictionnaire.
     */
    @Test
    public void testRandomWord() {
        System.out.println("randomWord");
        Dictionnaire dictionnaire = new Dictionnaire("init.txt");
        dictionnaire.load();
        String res = dictionnaire.randomWord();
        assert(res.length()>0);
    }

    /**
     * Test of getPathFile method, of class Dictionnaire.
     */
    @Test
    public void testGetPathFile() {
        System.out.println("getPathFile");
        Dictionnaire dictionnaire = new Dictionnaire("init.txt");
        String expResult = "dictionnaires/init.txt";
        String result = dictionnaire.getPathFile();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPathFile method, of class Dictionnaire.
     */
    @Test
    public void testSetPathFile() {
        System.out.println("setPathFile");
        String pathFile = "bloup";
        Dictionnaire dictionnaire = new Dictionnaire("init.txt");
        String expResult = "bloup";
        dictionnaire.setPathFile(pathFile);
        String result = dictionnaire.getPathFile();
        assertEquals(expResult, result);
    }

    /**
     * Test of getWords method, of class Dictionnaire.
     */
    @Test
    public void testGetWords() {
        System.out.println("getWords");
        Dictionnaire dictionnaire = new Dictionnaire("init.txt");
        dictionnaire.load();
        ArrayList<String> result = dictionnaire.getWords();
        assert(result.size()>2);
    }

    /**
     * Test of setWords method, of class Dictionnaire.
     */
    @Test
    public void testSetWords() {
        System.out.println("setWords");
        ArrayList<String> words = null;
        Dictionnaire dictionnaire = new Dictionnaire("init.txt");
        dictionnaire.load();
        dictionnaire.setWords(words);
        assert(dictionnaire.getWords()==null);
    }
    
}
