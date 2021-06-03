import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayButton extends Button
{
    
    public PlayButton(Observer ... observers) 
    {
        super(observers);
        GreenfootImage playButton = new GreenfootImage(120, 80);
        Font adjustedFont = new Font("Castellar",true, false, 35);
        playButton.setColor(Color.WHITE);
        playButton.setFont(adjustedFont);
        playButton.drawString("Play", 0, 50);
        setImage(playButton);
    }    
    
    protected void onClickedButton()
    {
        Greenfoot.setWorld(new FirstLevelWorld());
    }
}