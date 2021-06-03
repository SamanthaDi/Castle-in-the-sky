import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class main_menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World implements Observer
{
    private GreenfootSound soundtrack = new GreenfootSound("Main_menu.mp3");
    /**
     * Constructor for objects of class main_menu.
     * 
     */
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(new PlayButton(this), 80, 145);
        addObject(new HowToPlayButton(), 170, 190);
        addObject(new ScoresButton(), 95, 240);
        addObject(new ExitButton(this), 500, 350);
    }
    
    public void eventOcurred()
    {
        soundtrack.stop();
    }
    
    public void started()
    {
        soundtrack.play();
    }

}
