import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinnerWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinnerWorld extends World
{
    private GreenfootSound music;
    /**
     * Constructor for objects of class WinnerWorld.
     * 
     */
    public WinnerWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        music = new GreenfootSound("funkymusic.mp3");
        music.play();
        addObject(new Bread(), 300, 200);
        addObject(new Cheese(), 200, 300);
        addObject(new Goose(), 400, 300);
        music.stop();
    }
}
