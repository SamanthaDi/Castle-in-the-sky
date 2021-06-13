import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Castle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Castle extends Actor
{
    private double health = 1000;
    public void act() 
    {
        sufferDamage();
    }    
    
    public double gethealthPercent()
    {
        return (double)health/1000;
    }
    
    public void sufferDamage(){
        if(isTouching(InvasiveShip.class)){
            health -= 10;
        }
    }
    
}
