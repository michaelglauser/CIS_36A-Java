import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cat extends Animal
{
    public void act()
    {
        if(atWorldEdge())
        {
            turn(25);
        }
        if (Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(91) - 45);
        }
        move();

        if (canSee(Mouse.class))
        {
            eat(Mouse.class);
            Greenfoot.playSound("fanfare.wav");
            Greenfoot.stop();
        }


    }
}
