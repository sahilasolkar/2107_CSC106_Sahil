import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pipe extends Actor
{
    /**
     * Act - do whatever the Pipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int pipespeed = -4;
    
    public Pipe()
    {
        GreenfootImage myImage = getImage();
        int height = myImage.getHeight()/2;
        int width = myImage.getWidth()/2;
        myImage.scale(width, height);
    }
    
    public void act()
    {
        setLocation (getX() + pipespeed, getY());
        // Add your action code here.
    }
}
