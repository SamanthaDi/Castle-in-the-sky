import greenfoot.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;


public class ScoreWorld extends World
{
    private GreenfootImage score = new GreenfootImage("images/scores.jpg");
    private static ArrayList<Integer> highScoreList=new ArrayList<Integer>();
    private static String scoreString = "";
    private static String fileName = "Puntos.txt";
    
    public ScoreWorld()
    {    
        super(933, 700, 1);
        int y = 300;
        setBackground(score);
        addObject(new BackButton(), 870, 50);
        readHighScores();
        for(int i = 0; i < 5; i++){
            addObject(new scoreDrawString(highScoreList.get(i)), 160, y);
            y+=50;
        }
    }
    
    public void readHighScores(){
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String currLine = br.readLine();
            int i=Integer.parseInt("200");  
            
            while(currLine != null){
                highScoreList.add(Integer.parseInt(currLine));
                currLine = br.readLine();
            }
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    
}
