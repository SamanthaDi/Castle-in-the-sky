import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CastleLv1 extends Castle
{
   
    private GreenfootImage castle = new GreenfootImage("images/castle1.png");
    
    public CastleLv1()
    {
        setImage(castle);
        getImage().scale (getImage().getWidth()-60, getImage().getHeight()-60);
    }
    
    public void act()
    {
        sufferDamage();
    }
     
}
