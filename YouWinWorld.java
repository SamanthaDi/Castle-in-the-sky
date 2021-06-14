import greenfoot.*;  

public class YouWinWorld extends Level
{
    private GreenfootImage win = new GreenfootImage("images/finalWin.jpg");
    
    public YouWinWorld()
    {
        setBackground(win);
        addObject(new ExitButton(), getWidth()-140, getHeight()-30);
    }
}
