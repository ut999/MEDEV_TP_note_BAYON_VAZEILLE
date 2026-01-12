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
        Output out = new Output();
        
        out.affichageDebutJeu();
        
        jeu.setGameMode(in.chooseGameMode());
        
        if (jeu.getGameMode() == 0) {
            String dictionnary_name = in.inputDictionnaireName();
            Dictionnaire dict = new Dictionnaire(dictionnary_name);
            dict.load();
            jeu.setWordToGuess(dict.randomWord());
        }
        else {
            jeu.setWordToGuess(in.readMysteryWord(jeu.getMaxWordSize()));
        }
        
        jeu.setMaxErrors(in.readMaxErrorsAllowed(jeu.getMaxAllowed()));
        
        for (char letter : jeu.getWordToGuess().toCharArray()) {
            jeu.setShowGuessedLetters(jeu.getShowGuessedLetters().concat("_ "));
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
                
                int i = 0;
                String temp = new String();
                for (char l : jeu.getWordToGuess().toCharArray()) {
                    String str = String.valueOf(l);
                    if (str.equals(letter)) {
                        temp = temp.concat(str + " ");
                    }
                    else {
                        String stemp = jeu.getShowGuessedLetters();
                        temp = temp.concat(String.valueOf(stemp.charAt(i)) + " ");
                    }
                    i+=2;
                }
                jeu.setShowGuessedLetters(temp);
                
            } else {
                jeu.setCurrentError(jeu.getCurrentError() + 1);
            }

            if (hasPlayerWon(jeu)) {
                jeu.setGameState(1);   // Win
                out.affichageVictoire(jeu);
            } else if (hasPlayerLost(jeu)) {
                jeu.setGameState(-1);  // Game over
                out.affichageDefaite(jeu);
            }
            else {
                out.affichageTourJeu(jeu);
            }
        } 
    }
    
    public boolean hasPlayerWon(EtatJeu jeu)
    {
        return(jeu.getWordLetters().isEmpty());
    }
    public boolean hasPlayerLost(EtatJeu jeu)
    {
        return(jeu.getCurrentTurn() >= jeu.getMaxTurns()
                    || jeu.getCurrentError() >= jeu.getMaxErrors());
    }
}
