import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    private int speed;
    private int wallcordy;
    private int wallcordx;
    public Snake(int setSpeed, int wally , int wallx)
    {
        speed = setSpeed;
        wallcordy = wally;
        wallcordx = wallx;
    }
    /**
     * Act do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation( getX(), getY() + speed);
        if(isAtEdge())
        {
            setLocation( wallcordx, wallcordy);
        }  
    }    
}
