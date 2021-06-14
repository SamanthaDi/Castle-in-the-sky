import greenfoot.*;  

public class HowToPlayWorld extends World
{
    private GreenfootImage rules = new GreenfootImage("images/instrucciones.jpg");
    
    public HowToPlayWorld()
    {    
        super(933, 700, 1); 
        setBackground(rules);
        addObject(new BackButton(), 870, 50);

    }
}
