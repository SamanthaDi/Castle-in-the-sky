import greenfoot.*;  

public class YouWinWorld extends Level
{
    private GreenfootImage win = new GreenfootImage("images/finalWin.jpg");
    
    public YouWinWorld()
    {
        setBackground(win);
        selectSong("Win.mp3");
        playSong();
        addObject(new ExitButton(), getWidth()-140, getHeight()-30);
    }
}
