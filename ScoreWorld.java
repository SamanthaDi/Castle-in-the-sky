import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ScoreWorld extends World
{
    private GreenfootImage score = new GreenfootImage("images/scores.jpg");
    
    public ScoreWorld()
    {    
        super(933, 700, 1); 
        setBackground(score);
        addObject(new BackButton(), 870, 50);
    }
}
