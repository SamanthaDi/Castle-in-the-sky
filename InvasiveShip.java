import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InvasiveShip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InvasiveShip extends Actor
{
    private int Width, Height;
    protected int speed;
    
    public void act() 
    {
        move();
        destroy();
    }    
    
    public void move()
    {
        Castle castle = (Castle) getWorld().getObjects(Castle.class).get(0);  
        turnTowards(castle.getX(), castle.getY());
        move(speed);
    }
    
    public void destroy(){
        if(isTouching(Castle.class) || getY() >= getWorld().getHeight()-20){
            getWorld().removeObject(this);
        }
    }
    
    public void setSpeed(int value)
    {
        speed = value;
    }
}
