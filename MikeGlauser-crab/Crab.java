import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Animal
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private static int numWormsDevoured;

    public Crab()
    {
        image1 = new GreenfootImage("crab.png");
        image2 = new GreenfootImage("crab2.png");         
        setImage(image1);
        numWormsDevoured = 0;
    }

    public void act()
    {
        getWorld().showText("Number of worms devoured is " + numWormsDevoured, 50, 50);
        
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
        if(canSee(Worm.class))
        {
            eat(Worm.class);
            Greenfoot.playSound("slurp.wav");

            numWormsDevoured++;
            if( numWormsDevoured >=8)
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
        lookForWorm();
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

    public void lookForWorm()
    {
        if(canSee(Worm.class))
    	{
        	  eat(Worm.class);
        	  numWormsDevoured++;
        	  if( numWormsDevoured >= 8)
        	    {
            	Greenfoot.playSound("fanfare.wav");
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
