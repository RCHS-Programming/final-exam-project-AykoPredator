import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lives here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lives extends Actor
{
    /**
     * Act - do whatever the Lives wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int livesleft = 3;
    public void act() 
    {
       checkifLose();
       setImage(new  GreenfootImage("Lives: " + livesleft , 40,Color.WHITE, null));
    }  
    
    public void minuslives()
    {
        livesleft = livesleft - 1;
    }
    
    public void checkifLose()
    {
        if(livesleft < 1)
        {
           Greenfoot.setWorld(new Lose());
        }
    }
}
