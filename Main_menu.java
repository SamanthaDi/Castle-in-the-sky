import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class main_menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main_menu extends World
{
    
    /**
     * Constructor for objects of class main_menu.
     * 
     */
    public Main_menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Play(), 80, 145);
        addObject(new HowToPlay(), 170, 190);
        addObject(new Scores(), 95, 240);
        addObject(new Exit(), 500, 350);
    }

}
