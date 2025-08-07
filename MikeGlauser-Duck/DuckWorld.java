import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class DuckWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DuckWorld extends World
{

    /**
     * Constructor for objects of class DuckWorld.
     * 
     */
    public DuckWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        numbers = new ArrayList<Integer>();
        for(int i = 1; i <= 16; i++)
            numbers.add(i);

        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Duck duck = new Duck();
        addObject(duck,94,73);
        Duck duck2 = new Duck();
        addObject(duck2,238,73);
        Duck duck3 = new Duck();
        addObject(duck3,385,71);
        Duck duck4 = new Duck();
        addObject(duck4,512,75);
        Duck duck5 = new Duck();
        addObject(duck5,517,216);
        Duck duck6 = new Duck();
        addObject(duck6,510,360);
        Duck duck7 = new Duck();
        addObject(duck7,379,216);
        Duck duck8 = new Duck();
        addObject(duck8,240,215);
        Duck duck9 = new Duck();
        addObject(duck9,92,214);
        Duck duck10 = new Duck();
        addObject(duck10,376,356);
        Duck duck11 = new Duck();
        addObject(duck11,236,354);
        Duck duck12 = new Duck();
        addObject(duck12,97,352);
        Duck duck13 = new Duck();
        addObject(duck13,102,488);
        Duck duck14 = new Duck();
        addObject(duck14,242,489);
        Duck duck15 = new Duck();
        addObject(duck15,374,486);
        Duck duck16 = new Duck();
        addObject(duck16,513,493);
    }
    public static List numbers;
}
