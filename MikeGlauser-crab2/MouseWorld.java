import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MouseWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MouseWorld extends World
{

    /**
     * Constructor for objects of class MouseWorld.
     * 
     */
    public MouseWorld()
    {    
        super(760, 760, 1);
        setPaintOrder(Mouse.class, Cat.class, Strawberry.class);
        
        addObject(new Mouse(), 200, 300);
        addObject( new Cat(),250, 125 );
        for(int i=1; i<=35; i++)
            addObject(new Strawberry(), Greenfoot.getRandomNumber(540), Greenfoot.getRandomNumber(540)); 
    }
}
