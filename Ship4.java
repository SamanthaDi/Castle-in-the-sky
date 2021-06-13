import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InvasiveShip1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship4 extends InvasiveShip
{
    private int size = 10;
    private GreenfootImage ship1 = new GreenfootImage("images/InvasiveShip4.png");
    
    public Ship4(int speed)
    {
        setImage(ship1);
        getImage().scale (getImage().getWidth()/size, getImage().getHeight()/size);
        this.speed = speed;
    }
      
}
