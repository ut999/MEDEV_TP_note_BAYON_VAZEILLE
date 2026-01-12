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
    private int currentTurn;
    private int maxTurns;
    private String wordToGuess;
    private int maxWordSize;
    private int gameMode;
    private String showGuessedLetters;

    public EtatJeu() {
        this.guessedLetters = new ArrayList<>();
        this.wordLetters = new ArrayList<>();
        this.currentError = 0;
        this.maxErrors = 10;
        this.currentTurn = 0;
        this.maxTurns = 27;
        this.wordToGuess = "";
        this.maxWordSize = 20;
        this.gameMode = 0;
        this.showGuessedLetters = "";
    }
    
    public void print
    
    public void play() {
        
        for (char letter : this.wordToGuess) {
            if (!this.wordLetters.contains(letter)) {
                this.wordLetters.add(letter);
            }
        }
        this
        int gameState = 0;
        Input in = new Input();
        
        while (gameState == 0) {
            String letter = readPlayerCharacterTry(this.guessedLetters);
            this.currentTurn++;

            this.guessedLetters.add(letter);

            if (this.wordLetters.contains(letter)) {
                this.wordLetters.remove(letter);
            } else {
                this.currentError++;
            }

            if (this.wordLetters.isEmpty()) {
                gameState = 1;
            } else if (this.currentTurn >= this.maxTurns || this.currentError >= this.maxErrors) {
                gameState = -1;
            }
        }
    }

    public ArrayList<Character> getGuessedLetters() {
        return guessedLetters;
    }

    public void setGuessedLetters(ArrayList<Character> guessedLetters) {
        this.guessedLetters = guessedLetters;
    }

    public ArrayList<Character> getWordLetters() {
        return wordLetters;
    }

    public void setWordLetters(ArrayList<Character> wordLetters) {
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

    
    
    
}
