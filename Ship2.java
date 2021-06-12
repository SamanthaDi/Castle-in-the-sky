import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InvasiveShip1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship2 extends InvasiveShip
{
    private int size = 8;
    
    private GreenfootImage ship = new GreenfootImage("images/InvasiveShip4.png");
    
    public Ship2()
    {
        setImage(ship);
        getImage().scale (getImage().getWidth()/size, getImage().getHeight()/size);
    }
      
}
