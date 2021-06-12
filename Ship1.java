import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InvasiveShip1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship1 extends InvasiveShip
{
    private int size = 4;
    
    private GreenfootImage ship = new GreenfootImage("images/InvasiveShip7.png");
    
    public Ship1()
    {
        setImage(ship);
        getImage().scale (getImage().getWidth()/size, getImage().getHeight()/size);
    }
      
}
