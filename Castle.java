
import greenfoot.*;  

public class Castle extends Actor
{
    protected double health;
    
    public void act() 
    {
        sufferDamage();
    }    
    
    public double gethealthPercent()
    {
        return (double)health/1000;
    }
    
    public void sufferDamage(){
        InvasiveShip ship = (InvasiveShip)getOneIntersectingObject(InvasiveShip.class);
        if(isTouching(InvasiveShip.class)){
            health -= 50;
            getWorld().removeObject(ship);

        }
    }
    
}
