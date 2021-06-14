import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOverWorld extends World implements Observer
{
    private GreenfootImage gameOver = new GreenfootImage("images/the-destruction.jpg");
    static GreenfootSound soundtrack = new GreenfootSound("youLose.mp3");
    public GameOverWorld()
    {    
        super(933, 700, 1); 
        setBackground(gameOver);
        addObject(new TryAgainButton(this), getWidth() / 2, getHeight()-150);
    }
    
    public void eventOcurred()
    {
        soundtrack.stop();
    }
    
    public void started()
    {
        if(soundtrack.isPlaying()== false){
            soundtrack.play();
            soundtrack.setVolume(20);
        }
    }
}
