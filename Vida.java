import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vida extends Actor
{
    /**
     * Act - do whatever the Vida wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private RobotSoldier robot;
    private int width, height;
    
    public Vida(int width, int height, RobotSoldier robot)
    {
        this.width = width;
        this.height = height;
        this.robot = robot;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public void act() 
    {
        drawBar();
    }
    
    public void drawBar()
    {
        GreenfootImage bar = new GreenfootImage (width, height);
        bar.setColor (Color.RED);
        
        int healthWidth = (int)(robot.gethealthPercent()*width);
        bar.fillRect(0, 0, healthWidth, height);
        
        setImage(bar);
    }
}
