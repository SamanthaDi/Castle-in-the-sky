import greenfoot.*;  

public class ExitButton extends Button
{
   public ExitButton(Observer ... observers) 
    {
        super(observers);
        GreenfootImage playButton = new GreenfootImage(180, 100);
        Font adjustedFont = new Font("Castellar",true, false, 60);
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
