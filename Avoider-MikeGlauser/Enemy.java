import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    
    private int speed;
    
    public Enemy(int speed)
    {
        this.speed = speed;
    }
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY()+speed);
        
        if(getY()>getWorld().getHeight()-20)
            getWorld().removeObject(this);
    }
    
    public void setSpeed(int s)
    {
        speed = s;
    }
}
