import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sheep here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sheep extends Actor
    {
    public int lives = 3;
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkCollision();
        checkKeyPress();
        detectWallCollision();
        checkCollisionLevel2();
        checkCollisionWin();
        checkifLose();
    }    
    
        public void checkKeyPress()
    {
        if( Greenfoot.isKeyDown("up") )
        {
            setLocation( getX(), getY() - 5);
        }
        
        if( Greenfoot.isKeyDown("down") )
        {
            setLocation( getX(), getY() + 5);
        }

        if( Greenfoot.isKeyDown("right") )
        {
            setLocation( getX() + 5, getY() );
        }
        
        if( Greenfoot.isKeyDown("left") )
        {
            setLocation( getX() - 5, getY() );
        }
    }
   public void detectWallCollision(){ 
    if(isTouching(Wall.class))
    {
        setLocation(50,300);
        lives = lives - 1;
    }
    }
    
    public void checkCollision()
    {
        if(isTouching(Snake.class) || isTouching(Spider.class))
        {
            setLocation(50, 300);
            lives = lives - 1;
        }
    }
    public void checkCollisionLevel2()
    {
        if(isTouching(Barn.class))
        {
            Greenfoot.playSound("yipee.wav");
            Greenfoot.setWorld(new World2());
            setLocation(50, 300);
        }
    }
    public void checkCollisionWin()
    {
        if(isTouching(Barn2.class))
        {
            Greenfoot.playSound("yipee.wav");
            Greenfoot.setWorld(new WinScreen());
        }
    }
    public void checkifLose()
    {
        if(lives < 1)
        {
           Greenfoot.setWorld(new Lose());
        }
    }
}
