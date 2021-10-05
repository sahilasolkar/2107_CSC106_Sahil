import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Score() 
    {
        GreenfootImage newImage = new GreenfootImage(50, 200);
        setImage(newImage);
        GreenfootImage myImage = getImage();
        int height = myImage.getHeight()+10;
        int width = myImage.getWidth()+10;
        myImage.scale(width, height);
    }
    
    public void setScore(int score) 
    {
        GreenfootImage newImage = getImage();
        newImage.clear();
        
        //newImage.fill();
        
        newImage.drawString(""+ score, 30, 30);
        setImage(newImage);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
