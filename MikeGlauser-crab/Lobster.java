import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Animal
{
    public void act()
    {
        if(atWorldEdge())
        {
            turn(17);
        }
        if (Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(91) - 45);
        }
        move();

        if (canSee(Crab.class))
        {
            eat(Crab.class);
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }


    }
}
