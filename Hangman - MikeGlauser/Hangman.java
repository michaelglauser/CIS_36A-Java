import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hangman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Hangman extends World
{

    /**
     * Constructor for objects of class Hangman.
     * 
     */
    public Hangman()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Scanner sc = new Scanner(System.in);
        String[] words = {"curry","green","butler","buddy","moody",
                            "basket","hoops","golden","warrior","score",
                            "splash","dribble","passing","scoring","rebound",
                            "clutch","final","block","steal","victory"};
        char[] incorrectGuess = {' ',' ',' ',' ',' '};
        String secretWord = words[new Random().nextInt(20)];

        char[] correctGuess = new char[secretWord.length()];
        Arrays.fill(correctGuess, '-');
        String guess = "";

        int totalincorrectGuess = 0;
        System.out.println("HANGMAN");

        while (!guess.equalsIgnoreCase(secretWord)&&totalincorrectGuess<5){
            showProgress(totalincorrectGuess);
            showincorrectGuess(incorrectGuess);
            displaycorrectGuess(correctGuess);
            System.out.print("Guess a letter: ");
            char guessedChar = sc.next().charAt(0);
            if(checkGuess(guessedChar,secretWord,correctGuess)){
                guess = getGuessedString(correctGuess);
                System.out.println("\nCorrect guess!");
            }else {
                System.out.println("\nWrong guess");
                incorrectGuess[totalincorrectGuess] = guessedChar;
                totalincorrectGuess += 1;
            }
            System.out.println();
        }
        showProgress(totalincorrectGuess);
        System.out.println("Correct word: "+secretWord);
        if(guess.equalsIgnoreCase(secretWord)){
            System.out.println("User won!");
        }else{
            System.out.println("User lost!");
        }
    }

    private static String getGuessedString(char[] correctGuess) {
        String out = "";
        for (char c : correctGuess) {
            out += c;
        }
        return out;
    }

    private static boolean checkGuess(char guessedChar, String secretWord,char[] correctGuess) {
        boolean found = false;
        for (int i = 0; i < secretWord.length(); i++) {
            if(guessedChar == secretWord.charAt(i)){
                correctGuess[i] = guessedChar;
                found = true;
            }
        }
        return found;
    }

    private static void displaycorrectGuess(char[] correctGuess) {
        for (char guess : correctGuess) {
            System.out.print(guess+" ");
        }
        System.out.println();
    }

    private static void showincorrectGuess(char[] incorrectGuess) {
        System.out.print("Missed guesses: ");
        for (char wrongGuess : incorrectGuess) {
            System.out.print(wrongGuess + " ");
        }
        System.out.println();
    }

    private static void showProgress(int totalincorrectGuess) {
        System.out.println();

        switch (totalincorrectGuess){
            case 0:
                start();
                break;
            case 1:
                lost1();
                break;
            case 2:
                lost2();
                break;
            case 3:
                lost3();
                break;
            case 4:
                lost4();
                break;
            case 5:
                lost5();
                break;
        }
        System.out.println();
    }

    public static void lost5(){
        System.out.println("  +---+");
        System.out.println("  O    |");
        System.out.println(" /|\\   |");
        System.out.println(" / \\   |");
        System.out.println("==============");
    }

    public static void lost4(){
        System.out.println("  +---+");
        System.out.println("  O    |");
        System.out.println(" /|\\   |");
        System.out.println("       |");
        System.out.println("==============");
    }
    public static void lost3(){
        System.out.println("  +---+");
        System.out.println("  O    |");
        System.out.println(" /|    |");
        System.out.println("       |");
        System.out.println("==============");
    }

    public static void lost2(){
        System.out.println("  +---+");
        System.out.println("  O    |");
        System.out.println("  |    |");
        System.out.println("       |");
        System.out.println("==============");
    }

    public static void lost1(){
        System.out.println("  +---+");
        System.out.println("  O    |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("==============");
    }

    public static void start(){
        System.out.println("  +---+");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("==============");
    }
}
