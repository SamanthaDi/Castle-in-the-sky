import greenfoot.*;  

public class BackButton extends Button
{
   public BackButton(Observer ... observers) 
    {
        super(observers);
        GreenfootImage playButton = new GreenfootImage(180, 100);
        Font adjustedFont = new Font("Castellar",true, false, 40);
        playButton.setColor(Color.WHITE);
        playButton.setFont(adjustedFont);
        playButton.drawString("Back", 0, 50);
        setImage(playButton);
    }    
    
    protected void onClickedButton()
    {
        Greenfoot.setWorld(new MainMenu());
    }
}
