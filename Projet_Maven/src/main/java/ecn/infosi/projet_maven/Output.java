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
        
    }
    
    public void affichageVictoire(EtatJeu etatJeu)
    {
        
    }
    
    public void affichageDefaite(EtatJeu etatJeu)
    {

        
    }
    
    private void dessinPendu(double nbErreurs, double nbErreursMax)
    {
        if(nbErreurs >= nbErreursMax-0.001)
        {
            System.out.println(" +---+\n" +
                               " |   |\n" +
                               " O   |\n" +
                               "/|\\  |\n" +
                               " |   |\n" +
                               "/ \\  |\n" +
                               "=======");
            return;
        }
        if(nbErreurs >= nbErreursMax-0.001)
        {
            System.out.println(" +---+\n" +
                               " |   |\n" +
                               " O   |\n" +
                               "/|\\  |\n" +
                               " |   |\n" +
                               "/ \\  |\n" +
                               "=======");
            return;
        }
    }
}
