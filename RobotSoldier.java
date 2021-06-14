import greenfoot.*; 

public class RobotSoldier extends Actor
{
    
    static int grado = 0;
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
        refuelRobot();
    }
    
    public void movement(){
        int x = getX();
        int y = getY();
        boolean isMoving = false;
        
        setRotation(grado);
        
        
        if(Greenfoot.isKeyDown("space") && isMoving == false){
            isMoving = true;
        }else if(Greenfoot.isKeyDown("space")  && isMoving == true){
            isMoving = false;
        }else if(Greenfoot.isKeyDown("right")&& isMoving == false){
            grado+=OFFSET;
        }
        else if(Greenfoot.isKeyDown("left") && isMoving == false){
            grado-=OFFSET;
        }
        
        if(isMoving){
            move(5);
            getWorld().addObject(new Explosion(),x,y);
            gas--;
        }
    }
    
    public double gethealthPercent()
    {
        return (double)gas/1000;
    }
    
    public void sufferDamage(){
        if(isTouching(InvasiveShip.class)){
            gas -= 10;
        }
    }
    
    public void refuelRobot(){
        Crystal crystal = (Crystal)getOneIntersectingObject(Crystal.class);
        if(isTouching(Crystal.class) && gas <= 1000){
            gas += 125;
            getWorld().removeObject(crystal);
        }
    }
}
