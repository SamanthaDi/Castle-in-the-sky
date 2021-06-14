import greenfoot.*;  

public class Explosion extends RobotSoldier
{
    private int flag = 0;
    
    public Explosion(){
        this.setRotation(grado);
    }
    
    public void act() 
    {
        move(-20);
        if(flag > 1){
            destroy();
            flag = 0;
        } else {
            flag++;
            attackShip();
            drawBar();
        }
    }
    
    public void destroy(){
        getWorld().removeObject(this);
    }
    
    public void attackShip(){
        InvasiveShip ship = (InvasiveShip)getOneIntersectingObject(InvasiveShip.class);
        if(isTouching(InvasiveShip.class)){
            getWorld().removeObject(ship);
        }
    }
    
    public void drawBar()
    {
        GreenfootImage bar = new GreenfootImage (50, 10);
        bar.setColor(Color.BLUE);
        bar.fillRect(0, 0, 50, 10);
        
        setImage(bar);
    }
}
