import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Buttons
{
    public GreenfootSound soundtrack = new GreenfootSound("Main_menu.mp3");
    boolean firstTurn = true;
    public Play() 
    {
        GreenfootImage playButton = new GreenfootImage(120, 80);
        Font adjustedFont = new Font("Castellar",true, false, 35);
        playButton.setColor(Color.WHITE);
        playButton.setFont(adjustedFont);
        playButton.drawString("Play", 0, 50);
        setImage(playButton);
    }    
    
    public void act()
    {
        checkMouse();
        checkClick(new MyWorld());
        if(firstTurn)
        {
            soundtrack.playLoop();
            firstTurn = false;
        }
        if(Greenfoot.mouseClicked(this))
        {
            soundtrack.pause();
        }
    }
}
