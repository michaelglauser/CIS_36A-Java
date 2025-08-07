import greenfoot.*;

/**
 * Write a description of class Duck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Duck extends Actor
{
    private GifImage gifImage = new GifImage("ducky.gif");
    
    public void act()
    {
        setImage(gifImage.getCurrentImage());
        if (Greenfoot.mouseClicked(this)) { 
            if (luckyNumber == 7) {
                Greenfoot.setWorld(new WinnerWorld());
        }   else if (luckyNumber == 13) {
                Greenfoot.setWorld(new LoserWorld());
        }   else {
                getWorld().removeObject(this);
        }
    }    

    }
    private int luckyNumber;
    public Duck()
    {
         int numbersSize = DuckWorld.numbers.size();
         luckyNumber = (Integer) DuckWorld.numbers.remove(Greenfoot.getRandomNumber(numbersSize));
    }

}
