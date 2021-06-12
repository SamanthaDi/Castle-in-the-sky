import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FirstLevelWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstLevelWorld extends World
{

    /**
     * Constructor for objects of class FirstLevelWorld.
     * 
     */
    GreenfootImage background = new GreenfootImage("images/FondoLevel1.png");
    public FirstLevelWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        generateWorld();
    }
    
    private void generateWorld(){
        setBackground(background);
        RobotSoldier robot = new RobotSoldier();
        
        Vida vida = new Vida(200, 20 , robot);
        addObject (vida, vida.getWidth()/2+10, vida.getHeight()/2+10);
        
        addObject(new castleLv1(), 277, 189);
        addObject(robot,380, 180 );
        addObject(new Ship1(),180, 50 );
        addObject(new Ship2(),180, 100);
        addObject(new Ship3(),180, 150);
    }
}
