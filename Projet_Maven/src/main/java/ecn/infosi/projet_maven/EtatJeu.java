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
    private int currentError;
    private int maxErrors;
    private int maxAllowed;
    private int currentTurn;
    private int maxTurns;
    private String wordToGuess;
    private int maxWordSize;
    private int gameMode;
    private String showGuessedLetters;
    private int gameState;

    public EtatJeu() {
        this.guessedLetters = new ArrayList<>();
        this.wordLetters = new ArrayList<>();
        this.currentError = 0;
        this.maxErrors = 0;
        this.maxAllowed = 27;
        this.currentTurn = 0;
        this.maxTurns = 27;
        this.wordToGuess = "";
        this.maxWordSize = 20;
        this.gameMode = 0;
        this.showGuessedLetters = "";
        this.gameState = 0;
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

    public int getCurrentError() {
        return currentError;
    }

    public void setCurrentError(int currentError) {
        this.currentError = currentError;
    }

    public int getMaxErrors() {
        return maxErrors;
    }

    public void setMaxErrors(int maxErrors) {
        this.maxErrors = maxErrors;
    }

    public int getMaxAllowed() {
        return maxAllowed;
    }

    public void setMaxAllowed(int maxErrors) {
        this.maxAllowed = maxErrors;
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

    public int getGameMode() {
        return gameMode;
    }

    public void setGameMode(int gameMode) {
        this.gameMode = gameMode;
    }

    public String getShowGuessedLetters() {
        return showGuessedLetters;
    }

    public void setShowGuessedLetters(String showGuessedLetters) {
        this.showGuessedLetters = showGuessedLetters;
    }

    public int getGameState() {
        return gameState;
    }

    public void setGameState(int gameState) {
        this.gameState = gameState;
    }
}
