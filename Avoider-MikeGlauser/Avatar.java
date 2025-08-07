import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Avatar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Avatar extends Actor
{
    private boolean shrunk = false;
    private int scoreWhenShrunk = 0;
    GreenfootImage ordinaryAvatar = new GreenfootImage("skull.png");
    GreenfootImage invincibleAvatar = new GreenfootImage("spiderman.png");
    private boolean invincible = false;
    private SimpleTimer timer = new SimpleTimer();

    /**
     * Act - do whatever the Avatar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        followMouse();
        checkForCollisions();
        //Greenfoot.setWorld(new AvoiderGameOverWorld());
        //Greenfoot.setWorld(new AvoiderWorld());
        if(shrunk)
            getImage().scale(28,39);
        else
            getImage().scale(56,78);

        if (shrunk && AvoiderWorld.score.getValue()>scoreWhenShrunk + 10)
            shrunk = false;
        if(invincible)
            setImage(invincibleAvatar);
        else
            setImage(ordinaryAvatar);

        if(Greenfoot.getRandomNumber(1000) < 1 && !invincible)
        {
            invincible = true;
            timer.mark();
        }
        
        if(invincible && timer.millisElapsed() > 10000)
    	  {
        	      invincible = false;
    	  }
    }

    public void followMouse()
    {
        MouseInfo mi = Greenfoot.getMouseInfo();
        if(mi != null)
        {
            setLocation(mi.getX(), mi.getY());
        }
    }

    public void checkForCollisions()
    {
        Actor bear = getOneIntersectingObject(Bear.class);
        if(!shrunk && bear != null)
        {
            shrunk = true;
            scoreWhenShrunk = AvoiderWorld.score.getValue();
        }

        Actor enemy = getOneIntersectingObject(Enemy.class);
        if(enemy != null && !invincible)
        {
            getWorld().removeObject(this);
            AvoiderWorld.bkgMusic.stop();
            Greenfoot.setWorld(new AvoiderGameOverWorld());
        }
    }
}
