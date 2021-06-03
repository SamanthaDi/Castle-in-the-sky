import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract class Button extends Actor 
{
    private boolean mouseOver = false;
    private static int transparency = 255;
    private List<Observer> observers = new LinkedList();
    
    protected Button()
    {
        
    }
    
    protected Button(Observer ... observers)
    {
        for(Observer observer : observers)
        {
            this.observers.add(observer);
        }
    }
    
    public void act()
    {
        checkMouseOver();
        checkClick();
    }
    
    public void addObserver(Observer observer)
    {
        observers.add(observer);
    }
    public void checkMouseOver() 
    {
        if(Greenfoot.mouseMoved(null))
        {
            mouseOver = Greenfoot.mouseMoved(this);
        }
        
        if(mouseOver)
        {
            adjustTransparency(transparency/2);
        }
        else
        {
            adjustTransparency(transparency);
        }
        
    } 
    
    public void checkClick()
    {
         if(Greenfoot.mouseClicked(this))
        {
            for(Observer observer : observers)
            {
                observer.eventOcurred();
            }
            onClickedButton();
        }
    }
    
    abstract protected void onClickedButton();
    
    public void adjustTransparency(int adjust)
    {
        GreenfootImage buttImage = getImage();
        buttImage.setTransparency(adjust);
        setImage(buttImage);
    }
}


