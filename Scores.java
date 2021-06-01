import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scores extends Buttons
{
    public Scores() 
    {
        GreenfootImage playButton = new GreenfootImage(150, 80);
        Font adjustedFont = new Font("Castellar",true, false, 35);
        playButton.setColor(Color.WHITE);
        playButton.setFont(adjustedFont);
        playButton.drawString("Scores", 0, 50);
        setImage(playButton);
    }    
    
    public void act()
    {
        checkMouse();
        checkClick(new MyWorld());
    }
}
