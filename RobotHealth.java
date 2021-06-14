import greenfoot.*;  

public class RobotHealth extends HealthBar
{
    private RobotSoldier robot;

    public RobotHealth(int width, int height, RobotSoldier robot)
    {
        this.width = width;
        this.height = height;
        this.robot = robot;
    }

    public void act() 
    {
        drawBar();
    }

    public void drawBar()
    {
        GreenfootImage bar = new GreenfootImage (width, height);
        bar.setColor (Color.GREEN);

        int healthWidth = (int)(robot.gethealthPercent()*width);
        bar.fillRect(0, 0, healthWidth, height);

        setImage(bar);
    }
}

