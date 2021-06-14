import greenfoot.*; 

public class TryAgainButton extends Button 
{
   public TryAgainButton(Observer ... observers) 
    {
        super(observers);
        GreenfootImage playButton = new GreenfootImage(400, 100);
        Font adjustedFont = new Font("Castellar",true, false, 60);
        playButton.setColor(Color.WHITE);
        playButton.setFont(adjustedFont);
        playButton.drawString("Try again", 0, 50);
        setImage(playButton);
    }    
   
    protected void onClickedButton()
    {
        Greenfoot.setWorld(new MainMenu());
    }
}
