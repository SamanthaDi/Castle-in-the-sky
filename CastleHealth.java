import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CastleHealt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CastleHealth extends HealthBar
{
    private Castle castle;
    
    public CastleHealth(int width, int height, Castle castle)
    {
        this.width = width;
        this.height = height;
        this.castle = castle;
    }
    
    public void act() 
    {
        drawBar();
    }
    
    public void drawBar()
    {
        GreenfootImage bar = new GreenfootImage (width, height);
        bar.setColor (Color.BLUE);
        
        int healthWidth = (int)(castle.gethealthPercent()*width);
        bar.fillRect(0, 0, healthWidth, height);
        
        setImage(bar);
    }
}
