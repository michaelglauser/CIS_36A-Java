import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LoserWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoserWorld extends World
{
    private GreenfootSound music;
    private AnimatedImage image;
    private PlayButton playButton;
    private PauseButton pauseButton;
    /**
     * Constructor for objects of class LoserWorld.
     * 
     */
    public LoserWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        music = new GreenfootSound("losermusic.mp3");
        image = new AnimatedImage();
        playButton = new PlayButton();
        pauseButton = new PauseButton();
        addObject(image, 300, 200);
        addObject(playButton, 200, 350);
        addObject(pauseButton, 400, 350);
    }
        public void act() {

            if (music.isPlaying()) {
                //image.animate();

        }

    }
        private class PlayButton extends Actor {

            public PlayButton() {
                GreenfootImage image = new GreenfootImage("playbutton.png");
                setImage(image);

        }


            public void act() {
    
                if (Greenfoot.mouseClicked(this)) {
    
                    music.play();
    
                }
    
            }

    }


        private class PauseButton extends Actor {
    
            public PauseButton() {
    
                GreenfootImage image = new GreenfootImage("pausebutton.png");
    
                setImage(image);
    
            }


            public void act() {
    
                if (Greenfoot.mouseClicked(this)) {
    
                    music.pause();
    
                }

        }
}}
