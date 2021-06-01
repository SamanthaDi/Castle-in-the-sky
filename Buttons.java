import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buttons extends Actor
{
    private boolean mouseOver = false;
    private static int TRANS = 255;
    
    public void checkMouse() 
    {
        if(Greenfoot.mouseMoved(null))
        {
            mouseOver = Greenfoot.mouseMoved(this);
        }
        
        if(mouseOver)
        {
            adjTrans(TRANS/2);
        }
        else
        {
            adjTrans(TRANS);
        }
        
    } 
    
    public void checkClick(World world)
    {
         if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(world);
        }
    }
    
    public void adjTrans(int adjust)
    {
        GreenfootImage buttImage = getImage();
        buttImage.setTransparency(adjust);
        setImage(buttImage);
    }
}


