import greenfoot.*;  

public class CastleLv2 extends Castle
{
   
    private GreenfootImage castle = new GreenfootImage("images/castle2.png");
    
    public CastleLv2()
    {
        this.health = 1000;

        setImage(castle);
        getImage().scale (getImage().getWidth()/2 -30, getImage().getHeight()/2 -30);
    }
    
}
