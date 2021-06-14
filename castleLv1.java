import greenfoot.*;  

public class CastleLv1 extends Castle
{
   
    private GreenfootImage castle = new GreenfootImage("images/castle1.png");
    
    public CastleLv1()
    {
        this.health = 1000;
        setImage(castle);
        getImage().scale (getImage().getWidth()-60, getImage().getHeight()-60);
    }
    
     
    
}
