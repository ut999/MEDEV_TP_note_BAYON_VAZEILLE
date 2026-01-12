/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecn.infosi.projet_maven;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * Manage dictionnary and words for pendu game
 * @author utaab
 */
public class Dictionnaire {
    
    private String pathFile;
    private ArrayList<String> words;
    private final Random seed;

    /**
     * Constructor with initial configuration
     * @param pathFile
     */
    public Dictionnaire(String pathFile) {
        this.pathFile = "dictionnaires/" + pathFile;
        this.words = new ArrayList<>();
        this.seed = new Random();
    }

    /**
     * Load words listed in txt file and save in words
     */
    public void load() {
        this.words = new ArrayList<>();
        File file = new File(this.pathFile);
        FileReader reader = null;
        try{
            reader = new FileReader(file);
        }
        catch(IOException e){
            System.out.println("Error loading file");
        }
        try (BufferedReader buffReader = new BufferedReader(reader)) {
            String word;
            while ((word = buffReader.readLine()) != null) {
                this.words.add(word);
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
    
    /**
     * Pick a random word from list
     * @return Word picked randomly
     */
    public String randomWord() {
        int i = this.seed.nextInt(this.words.size());
        return this.words.get(i);
    }

    /**
     * Getter path File
     * @return Path to txt file containing words
     */
    public String getPathFile() {
        return pathFile;
    }

    /**
     * Setter path File
     * @param pathFile
     */
    public void setPathFile(String pathFile) {
        this.pathFile = pathFile;
    }

    /**
     * Getter words
     * @return List of words
     */
    public ArrayList<String> getWords() {
        return words;
    }

    /**
     * Setter words
     * @param words
     */
    public void setWords(ArrayList<String> words) {
        this.words = words;
    }
}
