import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotSoldier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RobotSoldier extends Actor
{
    
    public static int grado = 0;
    private static final int OFFSET = 5;
    private double gas = 1000;
    
    private GreenfootImage robotImage = new GreenfootImage("images/robot.png");
    
    public RobotSoldier()
    {
        setImage(robotImage);
        getImage().scale (getImage().getWidth()/6, getImage().getHeight()/6);
    }
    
    public void act() 
    {
        movement();
        sufferDamage();
    }
    
    public void movement(){
        int x = getX();
        int y = getY();
        
        setRotation(grado);
        
        if(Greenfoot.isKeyDown("right")){
            grado+=OFFSET;
        }
        else if(Greenfoot.isKeyDown("left")){
            grado-=OFFSET;
        }
        else if(Greenfoot.isKeyDown("space")){
            getWorld().addObject(new Explosion(),x,y);
            move(5);
        }
    }
    
    public double gethealthPercent()
    {
        return (double)gas/1000;
    }
    
    public void sufferDamage(){
        if(this.isTouching(InvasiveShip.class)){
            gas -= 10;
        }
    }
}
