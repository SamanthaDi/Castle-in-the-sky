import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Laser extends RobotSoldier
{
    private int flag = 0;
    
    public Laser(){
        this.setRotation(grado);
    }
    
    public void act() 
    {
        move(-20);
        if(flag > 3){
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
            World myWorld = getWorld();
            getWorld().removeObject(ship);
            Level level = (Level)myWorld;
            ScoreBoard score = level.getScore();
            score.addScore(300);
        }
    }
    
    public void drawBar()
    {
        GreenfootImage bar = new GreenfootImage (50, 10);
        bar.setColor(Color.CYAN);
        bar.fillRect(0, 0, 50, 10);
        setImage(bar);
    }
}
