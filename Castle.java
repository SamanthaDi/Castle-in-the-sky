import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
