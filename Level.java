import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends World
{
    
    ScoreBoard scoreBoard = new ScoreBoard();
    
    public ScoreBoard getScore(){
        return scoreBoard;
    }
    
    public Level()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(933, 700, 1);
    }
    
    
    
    protected void createShip(int speed)
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
    
    protected void createCrystal()
    {
        Crystal crystal = new Crystal();
        if(Greenfoot.getRandomNumber(300) == 7)
        addObject(crystal,Greenfoot.getRandomNumber(getWidth()), 0);
    }
}
