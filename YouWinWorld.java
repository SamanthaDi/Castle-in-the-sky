import greenfoot.*;  

public class YouWinWorld extends World implements Observer
{
    private GreenfootImage win = new GreenfootImage("images/finalWin.jpg");
    static GreenfootSound soundtrack = new GreenfootSound("Win.mp3");
    public YouWinWorld()
    {    
        super(933, 700, 1); 
        setBackground(win);
        addObject(new ExitButton(this), getWidth()-140, getHeight()-30);
    }
    
    public void eventOcurred()
    {
        soundtrack.stop();
    }
    
    public void started()
    {
        if(soundtrack.isPlaying()== false){
            soundtrack.play();
            soundtrack.setVolume(30);
        }  
    }
}
