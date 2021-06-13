import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InvasiveShip1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship6 extends InvasiveShip
{
    private int size = 10;
    private GreenfootImage ship1 = new GreenfootImage("images/InvasiveShip6.png");
    
    public Ship6(int speed)
    {
        setImage(ship1);
        getImage().scale (getImage().getWidth()/size, getImage().getHeight()/size);
        this.speed = speed;
    }
   
}
