import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Worm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worm extends Animal
{
    private GifImage img = new GifImage("worm.gif");
    
    
    
    public void act()
    {
        setImage(img.getCurrentImage());// Add your action code here.
    }
    public Worm()
	{
    	     img.setCurrentIndex();
	}

}
