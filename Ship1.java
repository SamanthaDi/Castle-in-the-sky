import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InvasiveShip1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship1 extends InvasiveShip
{
    private int size = 110;
    
    public Ship1()
    {
        getImage().scale (getImage().getWidth()-size, getImage().getHeight()-size);
    }
      
}
