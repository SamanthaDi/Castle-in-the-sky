import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PlayButton extends Button
{
    
    public PlayButton(Observer ... observers) 
    {
        super(observers);
        GreenfootImage playButton = new GreenfootImage(190, 80);
        Font adjustedFont = new Font("Castellar",true, false, 60);
        playButton.setColor(Color.WHITE);
        playButton.setFont(adjustedFont);
        playButton.drawString("Play", 0, 50);
        setImage(playButton);
    }    
    
    protected void onClickedButton()
    {
        Greenfoot.setWorld(new FirstLevelWorld(60));
    }
}
