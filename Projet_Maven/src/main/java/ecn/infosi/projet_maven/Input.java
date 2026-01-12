/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecn.infosi.projet_maven;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Manage les inputs de l'application
 * @author Clément
 */
public class Input {
    
    /**
     * Ask and return a character as a try for the player, needs the character to be different than precedent tries
     * @param previousTries list containing precedent tries
     * @return characters written by the player
     */
    public String readPlayerCharacterTry(ArrayList<String> previousTries)
    {
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        
        while(true)
        {
            boolean isInputCorrect = true;
            System.out.println("Veuillez entrer un charactere pour deviner le mot");

            String charInput = myObj.nextLine();  // Read user input
             
            if(charInput.length()!=1)
            {
                System.out.println("Votre input n'a pas la bonne taille");
                isInputCorrect=false;
            }
            if(!charInput.matches("[a-zA-Z]+"))
            {
                System.out.println("Votre input n'est pas une lettre");
                isInputCorrect=false;
            }
            if(previousTries.contains(charInput))
            {
                System.out.println("Votre input est une ancienne tentative");
                isInputCorrect=false;
            }
            
            if(isInputCorrect)
            {
                charInput = charInput.toLowerCase();
                System.out.println("Vous avez ecris le charactere : " + charInput); 
                return charInput;  
            }
        }

    }
    
    /**
     *  Ask and return a character as a try for the player, needs to be shorten than a given limit
     * @param maxSize max world size
     * @return mystery word written by the player
     */
    public String readMysteryWord(int maxSize)
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        
        while(true)
        {
            boolean isInputCorrect = true;
            System.out.println("Veuillez entrer un mot mystere a deviner");

            String wordInput = myObj.nextLine();  // Read user input
             
            if(wordInput.length()== 0)
            {
                System.out.println("Votre mot est vide");
                isInputCorrect=false;
            }
            
            if(!wordInput.matches("[a-zA-Z]+"))
            {
                System.out.println("Votre input n'est pas un mot");
                isInputCorrect=false;
            }
            
            if(wordInput.length()> maxSize)
            {
                System.out.println("Votre est plus grand que la limite");
                System.out.println("Limite autorisee : " + maxSize);
                isInputCorrect=false;
            }
            
            if(isInputCorrect)
            {
                wordInput = wordInput.toLowerCase();
                System.out.println("Vous avez ecris le mot : " + wordInput); 
                System.out.println("Cela vous convient il ? (Y/N)"); 

                String goodInput = myObj.nextLine();  // Read user input
                if(goodInput.equalsIgnoreCase("y")||goodInput.equalsIgnoreCase("yes"))
                { 
                    return wordInput;  
                }
            }
        }
    }
    
    /**
     *  Ask player for max errors allowed
     * @param maxAllowed max input possible
     *  @return result between 1 and intput
     */
    public int readMaxErrorsAllowed(int maxAllowed)
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        
        while(true)
        {
            boolean isInputCorrect = true;
            System.out.println("Veuillez entrer le nombre maximum d'erreur avant une defaite");
            System.out.println("L'input doit etre entre 1 et " + maxAllowed);

            int numInput = myObj.nextInt();  // Read user input
             
            if(numInput < 1 || numInput > maxAllowed)
            {
                System.out.println("Votre nombre est inferieur a 1 ou superieur au maximum autorisee");
                isInputCorrect=false;
            }
            
            if(isInputCorrect)
            {
                return numInput; 
            }
        }
    }
    
    /**
     * Ask player for gamemode, 0 for player vs computer, 1 for player vs player
     * @return 0 for player vs computer, 1 for player vs player
     */
    public int chooseGameMode()
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        
        while(true)
        {
            boolean isInputCorrect = true;
            System.out.println("Veuillez choisir le mode de jeu (0 : jouer contre l'ordinateur, 1 : jouer contre un autre joueur");

            int numInput = myObj.nextInt();  // Read user input
             
            if(numInput < 0 || numInput > 1)
            {
                System.out.println("Veuillez entrer 1 ou 0");
                isInputCorrect=false;
            }
            
            if(isInputCorrect)
            {
                return numInput; 
            }
        }
    }
    
    /**
     * Ask for the max word size allowed
     * @return max word size allowed
     */
    public int readMaxWordSize()
    {
                Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        
        while(true)
        {
            boolean isInputCorrect = true;
            System.out.println("Veuillez choisir la taille maximale du mot que vous pourrez deviner");

            int numInput = myObj.nextInt();  // Read user input
             
            if(numInput < 1)
            {
                System.out.println("Veuillez entrer un nombre strictement positive");
                isInputCorrect=false;
            }
            
            if(isInputCorrect)
            {
                return numInput; 
            }
        }
    }
    
    /**
     * Ask player for the dictionnaire file
     * @return dictionnaire file
     */
    public String inputDictionnaireName()
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        
        while(true)
        {
            boolean isInputCorrect = true;
            System.out.println("Veuillez entrer le nom du dictionnaire à utiliser (init.txt est le dictionnaire de base)");

            String wordInput = myObj.nextLine();  // Read user input
             
            if(wordInput.length()== 0)
            {
                System.out.println("nom de fichier est vide");
                isInputCorrect=false;
            }
            
            
            if(isInputCorrect)
            {
                return wordInput;
            }
        }
    }
}
