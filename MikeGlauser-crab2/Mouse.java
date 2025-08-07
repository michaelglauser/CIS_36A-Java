import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mouse extends Animal
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private static int numStrawberriesDevoured;

    public Mouse()
    {
        image1 = new GreenfootImage("mouse.png");
        image2 = new GreenfootImage("mouse.png");         
        setImage(image1);
        numStrawberriesDevoured = 0;
    }

    public void act()
    {
        getWorld().showText("Total strawberries eaten: " + numStrawberriesDevoured, 40, 40);
        
        if (atWorldEdge())
        {
            turn(8);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }

        if (Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }
        move();
        if(canSee(Strawberry.class))
        {
            eat(Strawberry.class);
            Greenfoot.playSound("slurp.wav");

            numStrawberriesDevoured++;
            if( numStrawberriesDevoured >=13)
            {
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }

            
        }
        
        if(getImage() == image1)
        {
            setImage(image2);
        }
        else
        {
            setImage(image1);
        }
        move();
        lookForStrawberries();
        turnAtEdge();
        checkKeyPressed();
        if( getImage() == image1 )
        {
               setImage(image2);
        }
        else
        {
               setImage(image1);
        }
    }

    public void lookForStrawberries()
    {
        if(canSee(Strawberry.class))
        {
              eat(Strawberry.class);
              numStrawberriesDevoured++;
              if( numStrawberriesDevoured >= 20)
                {
                Greenfoot.playSound("au.wav");
                Greenfoot.stop();
                }

              Greenfoot.playSound("slurp.wav");
        }

    }
    
    public void turnAtEdge()
    {
        if ( atWorldEdge() )
          {
                  turn(17);
          }

    }

    public void checkKeyPressed()
    {
        if (Greenfoot.isKeyDown("left"))
         {
                turn(-4);
          }
        if (Greenfoot.isKeyDown("right"))
          {
                   turn(4);
          }

    }

}
