/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecn.infosi.projet_maven;

/**
 * Manage les outputs de l'application
 * @author Clément
 */
public class Output {  

    /**
     *  Fonction d'affichage du debut du jeu
     *
     * 
     */
    public void affichageDebutJeu()
    {
        System.out.println("Bienvenue dans notre jeu du pendu");
        System.out.println("Il y a 2 modes de jeu differents");
        System.out.println("1. Jouer contre l'ordinateur, un mot est choisi au hasard parmis le dictionnaire de ton choix et tu dois le deviner.");
        System.out.println("2. Jouer contre un autre joueur, un premier joueur ecris un mot puis un second doit devenir  ce mot.");
    }
    
    /**
     *  Fonction d'affichage d'un tour de jeu
     * @param etatJeu etat actuel du jeu
     */
    public void affichageTourJeu(EtatJeu etatJeu)
    {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println("Tour n°" + etatJeu.getCurrentTurn());
        
        
        System.out.println("nombre d'erreurs commises : " + etatJeu.getWordToGuess());
        System.out.println("nombre d'erreurs maximum : " + etatJeu.getMaxErrors());
        dessinPendu(etatJeu.getCurrentError(), etatJeu.getMaxErrors());
        System.out.println("mot actuel : " + etatJeu.getShowGuessedLetters());
        
        
        System.out.println("Liste des lettres deja donnees : ");
        System.out.println();
        for(String s : etatJeu.getGuessedLetters())
        {
            System.out.print(s);
        }
        
        
    }
    
    /**
     *  Fonction d'affichage de la victoire d'un joueur
     * @param etatJeu
     */
    public void affichageVictoire(EtatJeu etatJeu)
    {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println("Felicitation tu as gagne!");
        System.out.println("Tu as gagne au tour n°" + etatJeu.getCurrentTurn());
        System.out.println("le mot etait : " + etatJeu.getWordToGuess());
        System.out.println("tu est alle jusque la : " + etatJeu.getShowGuessedLetters());
        
        System.out.println("nombre d'erreurs commises : " + etatJeu.getWordToGuess());
        System.out.println("nombre d'erreurs maximum : " + etatJeu.getMaxErrors());
        
        dessinPendu(etatJeu.getCurrentError(), etatJeu.getMaxErrors());
        
    }
    
    /**
     *  fonction d'affichage de la defaite d'un joueur
     * @param etatJeu
     */
    public void affichageDefaite(EtatJeu etatJeu)
    {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println("Dommage tu as perdu :(");
        System.out.println("Tu as perdu n°" + etatJeu.getCurrentTurn());
        System.out.println("le mot etait : " + etatJeu.getWordToGuess());
        
        
        dessinPendu(etatJeu.getCurrentError(), etatJeu.getMaxErrors());   
    }
    
    private void dessinPendu(double nbErreurs, double nbErreursMax)
    {
        if(nbErreurs/nbErreursMax >= 0.999)
        {
            System.out.println(" +---+\n" +
                               " |   |\n" +
                               " O   |\n" +
                               "/|\\  |\n" +
                               " |   |\n" +
                               "/ \\  |\n" +
                               "=======");
        }
        
        else if(nbErreurs/nbErreursMax >= 0.899)
        {
            System.out.println(" +---+\n" +
                               " |   |\n" +
                               " O   |\n" +
                               "/|\\  |\n" +
                               " |   |\n" +
                               "     |\n" +
                               "=======");
        }
        
        else if(nbErreurs/nbErreursMax >= 0.799)
        {
            System.out.println(" +---+\n" +
                               " |   |\n" +
                               " O   |\n" +
                               "/|\\  |\n" +
                               "     |\n" +
                               "     |\n" +
                               "=======");
        }
        
        else if(nbErreurs/nbErreursMax >= 0.699)
        {
            System.out.println(" +---+\n" +
                               " |   |\n" +
                               " O   |\n" +
                               "/|   |\n" +
                               "     |\n" +
                               "     |\n" +
                               "=======");
        }
        
        else if(nbErreurs/nbErreursMax >= 0.599)
        {
            System.out.println(" +---+\n" +
                               " |   |\n" +
                               " O   |\n" +
                               "     |\n" +
                               "     |\n" +
                               "     |\n" +
                               "=======");
        }
        
        else if(nbErreurs/nbErreursMax >= 0.499)
        {
            System.out.println(" +---+\n" +
                               " |   |\n" +
                               "     |\n" +
                               "     |\n" +
                               "     |\n" +
                               "     |\n" +
                               "=======");
        }
        
        else if(nbErreurs/nbErreursMax >= 0.399)
        {
            System.out.println(" +---+\n" +
                               "     |\n" +
                               "     |\n" +
                               "     |\n" +
                               "     |\n" +
                               "     |\n" +
                               "=======");
        }
        
        else if(nbErreurs/nbErreursMax >= 0.299)
        {
            System.out.println("    -+\n" +
                               "     |\n" +
                               "     |\n" +
                               "     |\n" +
                               "     |\n" +
                               "     |\n" +
                               "=======");
        }
        
        else if(nbErreurs/nbErreursMax >= 0.199)
        {
            System.out.println("      \n" +
                               "     |\n" +
                               "     |\n" +
                               "     |\n" +
                               "     |\n" +
                               "     |\n" +
                               "=======");
        }
        
        else if(nbErreurs/nbErreursMax >= 0.099)
        {
            System.out.println("      \n" +
                               "      \n" +
                               "      \n" +
                               "     |\n" +
                               "     |\n" +
                               "     |\n" +
                               "=======");
        }
        
        else 
        {
            System.out.println("      \n" +
                               "      \n" +
                               "      \n" +
                               "      \n" +
                               "      \n" +
                               "      \n" +
                               "=======");
        }
    }
}
