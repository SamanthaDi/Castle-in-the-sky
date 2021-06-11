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
    public FirstLevelWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new castleLv1(), 277, 189);
        addObject(new RobotSoldier(),380, 180 );
        addObject(new Ship1(),180, 50 );
        addObject(new Ship2(),180, 100);
        addObject(new Ship3(),180, 150);
    }
}
