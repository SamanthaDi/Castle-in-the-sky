import greenfoot.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;


/**
 * Write a description of class scoreDrawString here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class scoreDrawString extends Actor
{
    
    public scoreDrawString(int scoreInt) 
    {
        String scoreString=String.valueOf(scoreInt);
        GreenfootImage scoreDraw = new GreenfootImage(180, 100);
        Font adjustedFont = new Font("Castellar",true, false, 40);
        
        scoreDraw.setColor(Color.WHITE);
        scoreDraw.setFont(adjustedFont);
        scoreDraw.drawString(scoreString, 0, 50);
        setImage(scoreDraw);
    }
}
