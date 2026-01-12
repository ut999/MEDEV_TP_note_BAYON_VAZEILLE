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
     *
     * @return
     */
    public int readMaxErrorsAllowed()
    {
        return 7;
    }
    
    /**
     *
     * @return
     */
    public int chooseGameMode()
    {
        return 0;
    }
    
    /**
     *
     * @return
     */
    public int readMaxWordSize()
    {
        return 0;
    }
    
    /**
     *
     * @return
     */
    public String inputDictionnaireName()
    {
        return "";
    }
}
