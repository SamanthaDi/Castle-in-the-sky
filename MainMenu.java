import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;

public class MainMenu extends World implements Observer
{
    static GreenfootSound soundtrack;
    private GreenfootImage menu = new GreenfootImage("images/mainMenu.jpg");
    //private static SoundController sInstance;

    public MainMenu()
    {    
        super(933, 700, 1);
        selectSong("Main_menu.mp3");
        
        setBackground(menu);
        addObject(new PlayButton(this), 120, 260);
        addObject(new HowToPlayButton(this), 170, 340);
        addObject(new ScoresButton(this), 180, 430);
        addObject(new ExitButton(this), 700, 650);
    }

    public void eventOcurred()
    {
        soundtrack.stop();
    }

    public void act()
    {
        playSong();
    }
    
    public void selectSong(String songName){
        try {
            soundtrack = new GreenfootSound(songName);
        } catch (Exception ex) {
            // Ignore
        }
    }
    
    public void playSong(){
        if(soundtrack.isPlaying()== false){
            soundtrack.play();
            soundtrack.setVolume(55);
        }
    }

}
