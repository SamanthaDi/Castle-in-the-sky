import greenfoot.*;  

public class CastleHealth extends HealthBar
{
    private Castle castle;
    public CastleHealth(int width, int height, Castle castle)
    {
        this.width = width;
        this.height = height;
        this.castle = castle;
    }

    public void act() 
    {
        drawBar();
    }

    public void drawBar()
    {
        GreenfootImage bar = new GreenfootImage (width, height);
        bar.setColor (Color.BLUE);

        int healthWidth = (int)(castle.gethealthPercent()*width);
        bar.fillRect(0, 0, healthWidth, height);
        
        setImage(bar);
    }
}
