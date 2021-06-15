import greenfoot.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Actor
{
    private static int score;
    private static ArrayList<Integer> highScoreList=new ArrayList<Integer>();
    private static String scoreString = "";
    private static String fileName = "Puntos.txt";
    
    public ScoreBoard(){
        readHighScores();
    }
    
    public void addScore(int score){
        this.score += score;
    }
    
    public void cleanScore(){
        score = 0;
    }
    
    public int getScore(){
        return score;
    }
    
    public void act() 
    {
        setImage(new  GreenfootImage("Score: " + score, 40,Color.BLACK, null));
    }
    
    public void saveScore(){
        updateHighScoresArray();
        updateHighScoresFile();
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
    
    public void updateHighScoresArray(){
        try{
            int i = 0;
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String currLine = br.readLine();
            boolean flag = false;
            while(currLine != null){
                String aux = String.valueOf(score);
                if(highScoreList.get(i) < score  && !flag){
                    highScoreList.add(i,score);
                    flag = true;
                }
                currLine = br.readLine();
                i++;
            }
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public void updateHighScoresFile(){
        try
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for(int i=0; i < 5; i++){
                writer.write(highScoreList.get(i) + "\n");
            }
            writer.close();
        }catch(IOException e){
            System.out.println("File not found");
        }
    }
}
