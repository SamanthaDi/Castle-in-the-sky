import greenfoot.*;

public class Ship2 extends InvasiveShip
{
    private int size = 5;
    private GreenfootImage ship1 = new GreenfootImage("images/InvasiveShip2.png");
    
    public Ship2(int speed)
    {
        setImage(ship1);
        getImage().scale (getImage().getWidth()/size, getImage().getHeight()/size);
        this.speed = speed;
    }
      
 
}
