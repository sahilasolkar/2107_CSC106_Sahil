import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public GameOver()
    {
        GreenfootImage myImage = getImage();
        int height = myImage.getHeight()/4;
        int width = myImage.getWidth()/4;
        myImage.scale(width, height);
    }
    public void act()
    {
        // Add your action code here.
    }
}
