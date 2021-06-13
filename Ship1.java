import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InvasiveShip1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship1 extends InvasiveShip
{
    private int size = 10;
    private GreenfootImage ship1 = new GreenfootImage("images/InvasiveShip1.png");
    
    public Ship1(int speed)
    {
        setImage(ship1);
        getImage().scale (getImage().getWidth()/size, getImage().getHeight()/size);
        this.speed = speed;
    }
      
    /*public void act()
    {
        Castle castle = (Castle) getWorld().getObjects(Castle.class).get(0);  
        turnTowards(castle.getX(), castle.getY());
        move(speed);
    }*/
}
