import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowToPlay extends Buttons
{
    public HowToPlay() 
    {
        GreenfootImage playButton = new GreenfootImage(300, 80);
        Font adjustedFont = new Font("Castellar",true, false, 35);
        playButton.setColor(Color.WHITE);
        playButton.setFont(adjustedFont);
        playButton.drawString("How to play", 0, 50);
        setImage(playButton);
    }    
    
    public void act()
    {
        checkMouse();
        checkClick(new MyWorld());
    }
}
