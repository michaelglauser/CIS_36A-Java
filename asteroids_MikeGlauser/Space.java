import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)


/**
 * Space. Something for rockets to fly in...
 * 
 * @author Michael Kölling
 * @version 2.0
 */
public class Space extends World
{
    /**
     * Create the space world with black background and stars.
     */
    public Space() 
    {
        super(800, 600, 1);
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK);
        background.fill();
        createStars(300);
        Explosion.initialiseImages();
        prepare();
    }

    /**
     * Create some random stars in the world
     */
    private void createStars(int number) 
    {
        GreenfootImage background = getBackground();             
        for (int i=0; i < number; i++) {            
            int x = Greenfoot.getRandomNumber( getWidth() );
            int y = Greenfoot.getRandomNumber( getHeight() );
            int color = 150 - Greenfoot.getRandomNumber(120);
            background.setColorAt(x, y, new Color(color,color,color));
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rocket rocket = new Rocket();
        addObject(rocket,94,155);
        Asteroid asteroid = new Asteroid();
        addObject(asteroid,701,97);
        Asteroid asteroid2 = new Asteroid();
        addObject(asteroid2,710,496);
        Asteroid asteroid3 = new Asteroid();
        addObject(asteroid3,694,180);
        Asteroid asteroid4 = new Asteroid();
        addObject(asteroid4,699,264);
        Asteroid asteroid5 = new Asteroid();
        addObject(asteroid5,701,361);
    }
}