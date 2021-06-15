import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOverWorld extends Level implements Observer
{
    private GreenfootImage gameOver = new GreenfootImage("images/the-destruction.jpg");
    public GameOverWorld()
    {    
        setBackground(gameOver);
        selectSong("youLose.mp3");
        playSong();
        addObject(new TryAgainButton(this), getWidth() / 2, getHeight()-150);
    }
    
    public void eventOcurred()
    {
        soundtrack.stop();
    }
}
