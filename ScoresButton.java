import greenfoot.*;  

public class ScoresButton extends Button
{
    public ScoresButton(Observer ... observers) 
    {
        super(observers);
        GreenfootImage playButton = new GreenfootImage(300, 80);
        Font adjustedFont = new Font("Castellar",true, false, 60);
        playButton.setColor(Color.WHITE);
        playButton.setFont(adjustedFont);
        playButton.drawString("Scores", 0, 50);
        setImage(playButton);
    }    
    
    protected void onClickedButton()
    {
        Greenfoot.setWorld(new ScoreWorld());
    }
    
    
}
