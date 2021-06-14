import greenfoot.*;  

public class FirstLevelWorld extends World implements Level
{
    private GreenfootImage sky1 = new GreenfootImage("images/sky1.png");

    static GreenfootSound soundtrack = new GreenfootSound("invasion.mp3");

    private SimpleTimer time = new SimpleTimer();
    private Counter timeCount = new Counter();
    private int timeLimit;
    private int speed;
    
    
    public FirstLevelWorld(int timeLimit)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(933, 700, 1); 
        setBackground(sky1);
        RobotSoldier robot = new RobotSoldier();
        RobotHealth robotHP = new RobotHealth(200, 20 , robot);
        CastleLv1 castle= new CastleLv1();
        CastleHealth castleHP = new CastleHealth(200, 20 , castle);
        
        addObject (robotHP, robotHP.getWidth()/2+10, robotHP.getHeight()/2+10);
        addObject (castleHP, getWidth()/2, getHeight()/2+90);
        addObject(castle, getWidth() / 2, getHeight()/2);
        addObject(robot,380, 180 );
        addObject(timeCount, getWidth()/2, 20);
        this.timeLimit = timeLimit;
        timeCount.setValue(timeLimit);
        this.speed = 1;
    }

    public void act()
    {
        if(soundtrack.isPlaying()== false){
            soundtrack.play();
            soundtrack.setVolume(25);
        }  

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
            Greenfoot.stop();
        }
       
    }
    
    public void createShip(int speed)
    {
        Ship1 ship1 = new Ship1(speed);
        Ship2 ship2 = new Ship2(speed);
        Ship3 ship3 = new Ship3(speed);
        int aux = Greenfoot.getRandomNumber(500);
        if (aux == 5)
        {
            addObject(ship1, 0, Greenfoot.getRandomNumber(getHeight()));
        }
        else if(aux == 10)
        {
            addObject(ship2,Greenfoot.getRandomNumber(getWidth()), getHeight());
        }
        else if(aux == 20)
        {
            addObject(ship3,Greenfoot.getRandomNumber(getWidth()), getHeight());
        }

    }
    
    public void createCrystal()
    {
        Crystal crystal = new Crystal();
        if(Greenfoot.getRandomNumber(300) == 7)
        {
            addObject(crystal,Greenfoot.getRandomNumber(getWidth()), 0);
        }
        

    }
}