/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecn.infosi.projet_maven;

/**
 *
 * @author Clément
 */
public class Output {  
    public void affichageDebutJeu()
    {
    }
    
    public void affichageTourJeu(EtatJeu etatJeu)
    {
        System.out.println("------------------------------------");
        dessinPendu(etatJeu.getCurrentError(), etatJeu.getMaxErrors());
        System.out.println("mot actuel : ");
        for(String s : etatJeu.getGuessedLetters())
        
        System.out.println("Liste des lettres deja donnees : ");
        
    }
    
    public void affichageVictoire(EtatJeu etatJeu)
    {
        
    }
    
    public void affichageDefaite(EtatJeu etatJeu)
    {

        
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
