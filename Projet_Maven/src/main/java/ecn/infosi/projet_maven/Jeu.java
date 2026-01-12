/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecn.infosi.projet_maven;

/**
 *
 * @author utaab
 */
public class Jeu {
    
    
    public void play() {
        
        EtatJeu jeu = new EtatJeu(); 

        Input in = new Input();
        int gamemode = in.chooseGameMode();
        
        if (gamemode == 0) {
            
        }
        else {
            jeu.setWordToGuess(in.readMysteryWord(jeu.getMaxWordSize()));
        }
        int maxErrors = in.readMaxErrorsAllowed(jeu.getMaxAllowed());
        
        for (char letter : jeu.getWordToGuess().toCharArray()) {
            String str = String.valueOf(letter);
            if (!jeu.getWordLetters().contains(str)) {
                jeu.getWordLetters().add(str);
            }
        }
        
        while (jeu.getGameState() == 0) {

            String letter = in.readPlayerCharacterTry(jeu.getGuessedLetters());

            jeu.setCurrentTurn(jeu.getCurrentTurn() + 1);

            jeu.getGuessedLetters().add(letter);

            if (jeu.getWordLetters().contains(letter)) {
                jeu.getWordLetters().remove(letter);
            } else {
                jeu.setCurrentError(jeu.getCurrentError() + 1);
            }

            if (jeu.getWordLetters().isEmpty()) {
                jeu.setGameState(1);   // Win
            } else if (jeu.getCurrentTurn() >= jeu.getMaxTurns()
                    || jeu.getCurrentError() >= maxErrors) {
                jeu.setGameState(-1);  // Game over
            }
        }
    }
}
