import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExitButton extends Button
{
   public ExitButton(Observer ... observers) 
    {
        super(observers);
        GreenfootImage playButton = new GreenfootImage(150, 80);
        Font adjustedFont = new Font("Castellar",true, false, 35);
        playButton.setColor(Color.WHITE);
        playButton.setFont(adjustedFont);
        playButton.drawString("Exit", 0, 50);
        setImage(playButton);
    }    
    
    protected void onClickedButton()
    {
        Greenfoot.stop();
    }
}
