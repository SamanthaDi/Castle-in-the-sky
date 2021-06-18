import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FirstLevelWorld extends Level
{
    private GreenfootImage sky1 = new GreenfootImage("images/sky1.png");
    private SimpleTimer time = new SimpleTimer();
    private Counter timeCount = new Counter();
    private RobotSoldier robot = new RobotSoldier();
    private CastleLv1 castle= new CastleLv1();
    private int timeLimit;
    private int speed;
    
    
    
    public FirstLevelWorld(int timeLimit)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        setBackground(sky1);
        selectSong("invasion.mp3");
        playSong();
        RobotHealth robotHP = new RobotHealth(200, 20 , robot);
        CastleHealth castleHP = new CastleHealth(200, 20 , castle);
        
        addObject(scoreBoard, getWidth()-200, robotHP.getHeight()/2+10);
        addObject(robotHP, robotHP.getWidth()/2+10, robotHP.getHeight()/2+10);
        addObject(castleHP, getWidth()/2, getHeight()/2+90);
        addObject(castle, getWidth() / 2, getHeight()/2);
        addObject(robot,380, 180 );
        addObject(timeCount, getWidth()/2, 20);
        this.timeLimit = timeLimit;
        timeCount.setValue(timeLimit);
        this.speed = 1;
    }

    public void act()
    {
        if(time.millisElapsed() > 1000)
        {
            timeCount.add(-1);
            time.mark();
        }
        
        createCrystal();
        
        if(timeCount.getValue()%3 == 0)
        {
            createShip(speed);
        }
        
        if(timeCount.getValue() <= 0)
        {
            stopSong();
            Greenfoot.setWorld(new SecondLevelWorld(90));
        }
        
        if(robot.getHealth() < 0 || castle.getHealth() < 0){
            scoreBoard.saveScore();
            scoreBoard.cleanScore();
            stopSong();
            Greenfoot.setWorld(new GameOverWorld());
        }
       
    }
    
    
}