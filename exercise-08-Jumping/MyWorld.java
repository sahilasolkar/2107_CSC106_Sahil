import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    int pipecounter = 0;
    int ballcounter = 0;
    int score = 0;
    Score sc=null;
    int firstPipe = 240;
    
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 300, 1); 
        
        Ball b = new Ball();
        
        sc = new Score();
        sc.setScore(0);
        //Pipe p = new Pipe();
        
        addObject(b, 100, 100);
        addObject(sc, 100, 100);
        
        //addObject(p, 100, 100);
    }
    
    public void act()
    {
        pipecounter++;
        //System.out.println(pipecounter);
        
        if (pipecounter % 100 == 0)
        {
            Pipe p = new Pipe();
            addObject(p, getWidth(), 250);
            //counter = 0;
            
        }
        
        if (pipecounter >= firstPipe)
        {
            if (ballcounter % 100 == 0)
            {
                score++;
                sc.setScore(score);
            }
            ballcounter++;
            
            
        }
        
        
    }
}
