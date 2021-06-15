import greenfoot.*; 

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
        if(getY() >= getWorld().getHeight()-20){
            getWorld().removeObject(this);
        }
    }


    public void setSpeed(int value)
    {
        speed = value;
    }
}
