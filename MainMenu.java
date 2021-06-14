import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MainMenu extends World implements Observer
{
    static GreenfootSound soundtrack = new GreenfootSound("Main_menu.mp3");
    private GreenfootImage menu = new GreenfootImage("images/mainMenu.jpg");

    public MainMenu()
    {    
        super(933, 700, 1);

        setBackground(menu);
        addObject(new PlayButton(this), 120, 260);
        addObject(new HowToPlayButton(), 170, 340);
        addObject(new ScoresButton(), 180, 430);
        addObject(new ExitButton(this), 700, 650);
    }

    public void eventOcurred()
    {
        soundtrack.stop();
    }

    public void act()
    {
        if(soundtrack.isPlaying()== false){
            soundtrack.play();
            soundtrack.setVolume(25);
        }  
    }

}
