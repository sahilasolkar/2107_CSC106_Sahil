import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int dy = 0;
    int g = 1;
    int dx = 0;
    int boostspeed = -10;
    
    public Ball()
    {
        GreenfootImage myImage = getImage();
        int height = myImage.getHeight()/6;
        int width = myImage.getWidth()/6;
        myImage.scale(width, height);
    }
        
    
    
    public void act()
    {
        if (getOneIntersectingObject(Pipe.class) !=null)
        {
            displaygameover();
        }
        
        setLocation(getX() + dx , getY() + dy);
        
        
        
        if (Greenfoot.isKeyDown("up")==true)
        {
            dy = boostspeed;
        }
        
        if (getX() < 1)
        {
            //System.out.println("gameover");
            displaygameover();
            
            
        }
        dy = dy+g;
        
        if (Greenfoot.isKeyDown("right")== true)
        {
            setRotation(0);
            move(5);
            
            
        }
        if (Greenfoot.isKeyDown("left")== true)
        {
            setRotation(180);
            move(5);
            
            
        }
        
        
        
        
        
        
        /*if (Greenfoot.isKeyDown("left")==true)
        {
            dx = -5;
        }
        else
        {
            dx = 0;
        }
        */
        // Add your action code here.
    }
    private void displaygameover()
        {
            GameOver go = new GameOver();
            getWorld().addObject(go, getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
}
