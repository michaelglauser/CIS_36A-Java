import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Introduction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Introduction extends World
{

    /**
     * Constructor for objects of class Introduction.
     * 
     */
    public Introduction()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        addObject( new Label("Lucky Duck", 80), 300, 300 );
    	addObject( new Label("click anywhere to begin", 30), 300, 380);

    }
    public void act() {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new DuckWorld());
         }

        
    }


}
