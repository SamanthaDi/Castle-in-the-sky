import greenfoot.*;  

public class HowToPlayButton extends Button
{
    public HowToPlayButton(Observer ... observers) 
    {
        super(observers);
        GreenfootImage playButton = new GreenfootImage(300, 80);
        Font adjustedFont = new Font("Castellar",true, false, 60);
        playButton.setColor(Color.WHITE);
        playButton.setFont(adjustedFont);
        playButton.drawString("rules", 0, 50);
        setImage(playButton);
    }    
    
    protected void onClickedButton()
    {
        Greenfoot.setWorld(new HowToPlayWorld());
    }
}

