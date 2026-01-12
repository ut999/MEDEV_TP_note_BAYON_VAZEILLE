/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecn.infosi.projet_maven;

import java.util.ArrayList;

/**
 *
 * @author utaab
 */
public class EtatJeu {
    
    private ArrayList<String> guessedLetters;   // lettres déjà proposées
    private ArrayList<String> wordLetters;  // lettres du mot recherché
    private int currentTurn;
    private int maxTurns;
    private String wordToGuess;
    private int maxWordSize;

    public EtatJeu(String wordToGuess, int maxTurns) {
        this.guessedLetters = new ArrayList<>();
        this.wordLetters = new ArrayList<>();
        this.currentTurn = 0;
        this.maxTurns = maxTurns;
        this.wordToGuess = wordToGuess;
        this.maxWordSize = 20;
    }

    public EtatJeu(ArrayList<String> guessedLetters, ArrayList<String> wordLetters, int currentTurn, int maxTurns, String wordToGuess, int maxWordSize) {
        this.guessedLetters = guessedLetters;
        this.wordLetters = wordLetters;
        this.currentTurn = currentTurn;
        this.maxTurns = maxTurns;
        this.wordToGuess = wordToGuess;
        this.maxWordSize = maxWordSize;
    }
    

    public ArrayList<String> getGuessedLetters() {
        return guessedLetters;
    }

    public void setGuessedLetters(ArrayList<String> guessedLetters) {
        this.guessedLetters = guessedLetters;
    }

    public ArrayList<String> getWordLetters() {
        return wordLetters;
    }

    public void setWordLetters(ArrayList<String> wordLetters) {
        this.wordLetters = wordLetters;
    }

    public int getCurrentTurn() {
        return currentTurn;
    }

    public void setCurrentTurn(int currentTurn) {
        this.currentTurn = currentTurn;
    }

    public int getMaxTurns() {
        return maxTurns;
    }

    public void setMaxTurns(int maxTurns) {
        this.maxTurns = maxTurns;
    }

    public String getWordToGuess() {
        return wordToGuess;
    }

    public void setWordToGuess(String wordToGuess) {
        this.wordToGuess = wordToGuess;
    }

    public int getMaxWordSize() {
        return maxWordSize;
    }

    public void setMaxWordSize(int maxWordSize) {
        this.maxWordSize = maxWordSize;
    }

    
    
}
