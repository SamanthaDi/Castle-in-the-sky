import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends RobotSoldier
{
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage exp = new GreenfootImage("images/Explosion.png");
    private int Switch = 0;
    
    public Explosion(){
        exp.scale(50, 50);
        setImage(exp);
        this.setRotation(grado);
        move(-50);
    }
    
    public void act() 
    {
        
        if(Switch > 3){
            destroy();
            move(-5);
            Switch = 0;
        } else {
            Switch++;
        }
    }
    
    public void destroy(){
        getWorld().removeObject(this);
    }
    
    public void animation(){
        
    }
}
