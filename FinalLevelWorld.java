import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FinalLevelWorld extends Level
{
    private GreenfootImage sky1 = new GreenfootImage("images/sky1.png");
    private SimpleTimer time = new SimpleTimer();
    private RobotSoldier robot = new RobotSoldier();
    private CastleLv2 castle= new CastleLv2();
    private Counter timeCount = new Counter();
    private int timeLimit;
    private int speed;
    
    
    
    public FinalLevelWorld(int timeLimit)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        setBackground(sky1);
        RobotHealth robotHP = new RobotHealth(200, 20 , robot);
        CastleHealth castleHP = new CastleHealth(200, 20 , castle);
        selectSong("finalShowdown.mp3");
        playSong();
        
        
        addObject(scoreBoard, 100, 40);
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
            scoreBoard.saveScore();
            scoreBoard.cleanScore();
            stopSong();
            Greenfoot.setWorld(new YouWinWorld());
        }
        if(robot.getHealth() < 0 || castle.getHealth() < 0){
            scoreBoard.saveScore();
            scoreBoard.cleanScore();
            stopSong();
            Greenfoot.setWorld(new GameOverWorld());
        }
    }
}
