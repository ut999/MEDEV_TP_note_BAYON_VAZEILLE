/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecn.infosi.projet_maven;

import java.util.ArrayList;

/**
 * This is a class to manage every game variable and data.
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

    /**
     * Constructor with initial parameters
     */
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

    /**
     * Getter of guessed letters
     * @return guessed letters
     */
    public ArrayList<String> getGuessedLetters() {
        return guessedLetters;
    }

    /**
     * Setter of guessed letters
     * @param guessedLetters
     */
    public void setGuessedLetters(ArrayList<String> guessedLetters) {
        this.guessedLetters = guessedLetters;
    }

    /**
     * Getter of word letters
     * @return word letters
     */
    public ArrayList<String> getWordLetters() {
        return wordLetters;
    }

    /**
     * Setter of word letters
     * @param wordLetters
     */
    public void setWordLetters(ArrayList<String> wordLetters) {
        this.wordLetters = wordLetters;
    }

    /**
     * Getter of current error
     * @return current error
     */
    public int getCurrentError() {
        return currentError;
    }

    /**
     * Setter of current error
     * @param currentError
     */
    public void setCurrentError(int currentError) {
        this.currentError = currentError;
    }

    /**
     * Getter of max error choosed
     * @return max error choosed
     */
    public int getMaxErrors() {
        return maxErrors;
    }

    /**
     * Setter of max error choosed
     * @param maxErrors
     */
    public void setMaxErrors(int maxErrors) {
        this.maxErrors = maxErrors;
    }

    /**
     * Getter of max error allowed
     * @return max error allowed
     */
    public int getMaxAllowed() {
        return maxAllowed;
    }

    /**
     * Setter of max error allowed
     * @param maxErrors
     */
    public void setMaxAllowed(int maxErrors) {
        this.maxAllowed = maxErrors;
    }
    
    /**
     * Getter of current turn
     * @return current turn
     */
    public int getCurrentTurn() {
        return currentTurn;
    }

    /**
     * Setter of current turn
     * @param currentTurn
     */
    public void setCurrentTurn(int currentTurn) {
        this.currentTurn = currentTurn;
    }

    /**
     * Getter of max turns
     * @return max turns
     */
    public int getMaxTurns() {
        return maxTurns;
    }

    /**
     * Setter of max turns
     * @param maxTurns
     */
    public void setMaxTurns(int maxTurns) {
        this.maxTurns = maxTurns;
    }

    /**
     * Getter of word to guess
     * @return word to guess
     */
    public String getWordToGuess() {
        return wordToGuess;
    }

    /**
     * Setter of word to guess
     * @param wordToGuess
     */
    public void setWordToGuess(String wordToGuess) {
        this.wordToGuess = wordToGuess;
    }

    /**
     * Getter of maximum word size
     * @return maximum word size
     */
    public int getMaxWordSize() {
        return maxWordSize;
    }

    /**
     * Setter of maximum word size
     * @param maxWordSize
     */
    public void setMaxWordSize(int maxWordSize) {
        this.maxWordSize = maxWordSize;
    }

    /**
     * Getter of gamemode
     * @return gamemode
     */
    public int getGameMode() {
        return gameMode;
    }

    /**
     * Setter of gamemode
     * @param gameMode
     */
    public void setGameMode(int gameMode) {
        this.gameMode = gameMode;
    }

    /**
     * Getter of show guessed letters
     * @return show guessed letters
     */
    public String getShowGuessedLetters() {
        return showGuessedLetters;
    }

    /**
     * Setter of show guessed letters
     * @param showGuessedLetters
     */
    public void setShowGuessedLetters(String showGuessedLetters) {
        this.showGuessedLetters = showGuessedLetters;
    }

    /**
     * Getter of gamestate
     * @return gamestate
     */
    public int getGameState() {
        return gameState;
    }

    /**
     * Setter of gamestate
     * @param gameState
     */
    public void setGameState(int gameState) {
        this.gameState = gameState;
    }
}
