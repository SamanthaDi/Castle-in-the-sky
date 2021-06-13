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
    private GreenfootImage menu = new GreenfootImage("images/mainMenu.jpg");
    
    public MainMenu()
    {    
        super(933, 700, 1); 
        setBackground(menu);
        addObject(new PlayButton(this), 120, 260);
        addObject(new HowToPlayButton(), 170, 340);
        addObject(new ScoresButton(), 180, 430);
        addObject(new ExitButton(this), 700, 650);
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
