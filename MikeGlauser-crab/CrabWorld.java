import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        setPaintOrder(Crab.class, Lobster.class, Worm.class);
        addObject( new Crab(), 150, 100 );
        addObject(new Crab(), 300, 300);
        addObject( new Lobster(),250, 125 );
        addObject( new Lobster(),150, 125 );
        addObject( new Lobster(),50, 125 );
        for(int i=1; i<=30; i++)
            addObject(new Worm(), Greenfoot.getRandomNumber(540), Greenfoot.getRandomNumber(540));
    }
}