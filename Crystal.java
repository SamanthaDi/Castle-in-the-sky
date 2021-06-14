import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crystal extends Actor
{
    private GreenfootImage CrystalImage = new GreenfootImage("images/crystal.png");
    
    public Crystal(){
        setImage(CrystalImage);
        this.setRotation(90);
        getImage().scale (getImage().getWidth()/3, getImage().getHeight()/3);
        
    }
    
    public void act() 
    {
        move(3);
        destroy();
    }
    
    public void destroy(){
        if(getY() >= getWorld().getHeight()-20){
            getWorld().removeObject(this);
        }
    }

}

